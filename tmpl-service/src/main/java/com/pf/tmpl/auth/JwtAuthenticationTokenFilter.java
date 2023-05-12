package com.pf.tmpl.auth;


import com.pf.tmpl.util.HttpResponseRender;
import com.pf.tmpl.util.JwtUtil;
import com.pf.tmpl.constant.Constant;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * @ClassName JwtAuthenticationTokenFilter
 * @Description TODO
 * @Author pengfei
 * @Date 2022/8/31
 **/
@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {


    @Resource
    @Qualifier("redisTemplate")
    RedisTemplate redisCache;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        //获取token
        String token = request.getHeader("token");
        // 没有token直接放行
        if (!StringUtils.hasText(token)) {
            filterChain.doFilter(request, response);
            return;
        }
        //解析token
        String userid;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userid = claims.getSubject();
        } catch (Exception e) {
            HttpResponseRender.render(response,HttpStatus.SERVICE_UNAVAILABLE,
                    Constant.NO_AUTH);
            return;
        }
        //从redis中获取用户信息
        String redisKey = Constant.LOGIN_CACHE_KEY + userid;
        LoginInfo loginInfo = (LoginInfo) redisCache.opsForValue().get(redisKey);
        if(Objects.isNull(loginInfo)){
            HttpResponseRender.render(response,HttpStatus.SERVICE_UNAVAILABLE,
                    Constant.NO_EXIST_USER);
            return;
        }

        //存入SecurityContextHolder
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(loginInfo,null,null);
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        //放行
        filterChain.doFilter(request, response);

    }
}

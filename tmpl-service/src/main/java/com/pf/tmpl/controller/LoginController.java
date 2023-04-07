package com.pf.tmpl.controller;

import com.pf.common.bean.CommonResult;
import com.pf.tmpl.auth.LoginInfo;
import com.pf.tmpl.constant.Constant;
import com.pf.tmpl.util.JwtUtil;
import com.pf.tmpl.controller.vo.LoginVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author pengfei
 * @Date 2022/8/31
 **/
@Api(tags = {"登陆模块"})
@RestController
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Resource
    @Qualifier("redisTemplate")
    RedisTemplate redisCache;

    @ApiOperation("登录接口")
    @PostMapping("/login")
    public CommonResult<String> login(LoginVo loginVo) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginVo.getName(),
                loginVo.getPassword());
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        if (authentication == null) {
            return CommonResult.failed("NO_AUTH");
        }
        LoginInfo loginInfo = (LoginInfo) authentication.getPrincipal();
        long id = loginInfo.getUser().getId();
        String token = JwtUtil.createJWT("" + id);
        redisCache.opsForValue().set(Constant.LOGIN_CACHE_KEY + id, loginInfo);
        return CommonResult.success(token);
    }
}

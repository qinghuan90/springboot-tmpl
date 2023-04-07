package com.pf.tmpl.auth;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.pf.tmpl.auth.LoginInfo;
import com.pf.tmpl.dto.UserInfo;
import com.pf.tmpl.mapper.UserInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserDetailServerImpl
 * @Description TODO
 * @Author pengfei
 * @Date 2022/8/31
 **/
@Slf4j
@Service
public class UserDetailServerImpl implements UserDetailsService {

    @Autowired
    UserInfoMapper userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo user = null;
        try {
            Wrapper<UserInfo> query = Wrappers.lambdaQuery(UserInfo.class).eq(UserInfo::getCode, username);
            user = userDao.selectOne(query);
        } catch (Exception e) {
           log.error("loadUserByUsername error:", e);
        }
        return new LoginInfo(user);
    }
}

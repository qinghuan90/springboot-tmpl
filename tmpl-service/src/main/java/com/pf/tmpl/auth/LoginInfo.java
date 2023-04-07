package com.pf.tmpl.auth;

import com.pf.tmpl.dto.UserInfo;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 * @ClassName LoginInfo
 * @Description TODO
 * @Author pengfei
 * @Date 2022/8/31
 **/
@Data
public class LoginInfo implements UserDetails, Serializable {
    private String token;
    private UserInfo user;

    public LoginInfo() {
    }

    public LoginInfo(UserInfo user) {
        this.user = user;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getCode();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}

package com.pf.tmpl.controller;

import com.pf.common.bean.CommonResult;
import com.pf.tmpl.auth.LoginInfo;
import com.pf.tmpl.dto.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author pengfei
 * @Date 2022/8/31
 **/
@Api(tags = {"用户模块"})
@RestController
@RequestMapping("user")
public class UserController {


    @ApiOperation("用户信息接口")
    @GetMapping("/info")
    public CommonResult<UserInfo> userInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginInfo loginInfo = (LoginInfo) authentication.getPrincipal();
        return  CommonResult.success(loginInfo.getUser());
    }

}

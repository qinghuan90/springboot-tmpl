package com.pf.tmpl.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pf.common.bean.CommonResult;
import com.pf.tmpl.auth.LoginInfo;
import com.pf.tmpl.controller.vo.UserQueryForm;
import com.pf.tmpl.dto.UserInfo;
import com.pf.tmpl.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UserInfoService userInfo;

    @ApiOperation("用户信息接口")
    @GetMapping("/info")
    public CommonResult<UserInfo> userInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginInfo loginInfo = (LoginInfo) authentication.getPrincipal();
        return  CommonResult.success(loginInfo.getUser());
    }


    @ApiOperation("用户信息接口")
    @GetMapping("/list")
    @SentinelResource()
    public CommonResult<Page> list(UserQueryForm form) {
        LambdaQueryWrapper<UserInfo> queryWrapper = Wrappers.lambdaQuery(UserInfo.class);
        if (form.getName() != null) {
            queryWrapper = queryWrapper.like(UserInfo::getNickName, form.getName());
        }
        Page<UserInfo> page = userInfo.page(form,queryWrapper);
        return  CommonResult.success(page);
    }

}

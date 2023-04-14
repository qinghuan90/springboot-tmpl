package com.pf.tmpl.controller;

import com.pf.common.bean.CommonResult;
import com.pf.tmpl.dto.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author pengfei
 * @Date 2022/8/31
 **/
@Api(tags = {"菜单模块"})
@RestController
@RequestMapping("menu")
public class MenuController {


    @ApiOperation("用户菜单权限信息")
    @GetMapping("/info")
    public CommonResult<UserInfo> menu() {
        return  CommonResult.success();
    }

}

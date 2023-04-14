package com.pf.tmpl.controller;

import com.pf.common.bean.CommonResult;
import com.pf.tmpl.feign.IRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OpenController
 * @Description TODO
 * @Author pengfei
 * @Date 2023/3/22
 **/
@RestController
@RequestMapping("api")
public class TestController {

    @Autowired
    IRemoteService remoteService;

    @GetMapping("/fn")
    public CommonResult fn() {
        return CommonResult.success(remoteService.name());
    }

    @GetMapping("/ff")
    public CommonResult ff() {
        return CommonResult.success("123456");
    }
}

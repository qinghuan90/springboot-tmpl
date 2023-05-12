package com.pf.tmpl.controller;

import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.pf.common.bean.CommonResult;
import com.pf.common.utils.AssertUtil;
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
    @SentinelResource
    public CommonResult ff() {
        AssertUtil.strNotBlank("","NO_PARAM");
        return CommonResult.success();
    }
}

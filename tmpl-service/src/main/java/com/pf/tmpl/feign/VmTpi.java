package com.pf.tmpl.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName VmTpi
 * @Description TODO
 * @Author pengfei
 * @Date 2023/4/7
 **/
@Component
@FeignClient(name = "test-server",url = "localhost:8090/demo")
public interface VmTpi {

    @GetMapping("/name")
    public  String getName();


}

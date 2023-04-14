package com.pf.tmpl.feign;

import com.pf.tmpl.feign.fallback.IRemoteServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName IRemoteService
 * @Description TODO
 * @Author pengfei
 * @Date 2023/4/14
 *  坑：feign  value 值不支持下划线，只能用中划线
 *
 **/
@Component
@FeignClient(contextId = "remoteService",url = "http://localhost:8090/pf",
        value="remote-system",fallback = IRemoteServiceFallback.class)
public interface IRemoteService {

    @GetMapping("/name")
     String name();
}

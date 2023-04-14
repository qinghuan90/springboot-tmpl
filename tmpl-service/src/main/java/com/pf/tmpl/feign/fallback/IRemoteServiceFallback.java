package com.pf.tmpl.feign.fallback;

import com.pf.tmpl.feign.IRemoteService;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName IRemoteServiceFallback
 * @Description TODO
 * @Author pengfei
 * @Date 2023/4/14
 **/
@Component
public class IRemoteServiceFallback implements IRemoteService {

    @Override
    public String name() {
        return "AAAAAA";
    }
}

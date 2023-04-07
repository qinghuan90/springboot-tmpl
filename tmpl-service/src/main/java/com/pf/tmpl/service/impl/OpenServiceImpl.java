package com.pf.tmpl.service.impl;

import com.pf.tmpl.service.OpenService;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OpenServiceImpl
 * @Description TODO
 * @Author pengfei
 * @Date 2023/3/22
 **/
@Service
public class OpenServiceImpl implements OpenService {

  @Autowired
    RedissonClient redissonClient;

    @Override
    public String getRedis() {
        return null;
    }
}

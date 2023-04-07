package com.pf.tmpl.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;


/**
 * @ClassName RedissonConfig
 * @Description TODO
 * @Author pengfei
 * @Date 2023/3/22
 **/
@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() throws IOException {
        Config config = Config.fromYAML(RedissonConfig.class.getClassLoader().getResource("config/redisson.yaml"));
        return Redisson.create(config);
    }
}


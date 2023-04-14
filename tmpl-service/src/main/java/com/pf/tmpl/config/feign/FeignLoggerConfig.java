package com.pf.tmpl.config.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignLoggerConfig
 * @Description TODO
 * @Author pengfei
 * @Date 2023/4/14
 **/
@Configuration
public class FeignLoggerConfig {

    @Bean
    Logger.Level loggerLevel(){
        return Logger.Level.BASIC;
    }
}

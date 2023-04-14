package com.pf.tmpl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@MapperScan("com.pf.tmpl.mapper")
public class TmplApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmplApplication.class, args);
    }

}

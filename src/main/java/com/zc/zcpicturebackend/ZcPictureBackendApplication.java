package com.zc.zcpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.zc.zcpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class ZcPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZcPictureBackendApplication.class, args);
    }

}

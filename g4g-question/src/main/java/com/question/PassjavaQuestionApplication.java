package com.question;

import com.question.service.ITypeService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableCaching
@EnableFeignClients(basePackages = "com.question.feign")
@EnableDiscoveryClient
@MapperScan("com.question.dao")
@SpringBootApplication
public class PassjavaQuestionApplication {
    private static ITypeService typeService;

    public static void main(String[] args) {
        SpringApplication.run(PassjavaQuestionApplication.class, args);
    }
}

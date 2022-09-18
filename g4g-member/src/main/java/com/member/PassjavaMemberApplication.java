package com.member;

import com.common.config.WebMvcConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

/**
 * @author tongyao
 */
@EnableFeignClients(basePackages = "com.member.feign")
@EnableDiscoveryClient
@MapperScan("com.member.dao")
@SpringBootApplication(scanBasePackages = "com")
@Import({WebMvcConfig.class})
public class PassjavaMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaMemberApplication.class, args);
    }

}

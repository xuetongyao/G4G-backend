package com.channel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.channel.dao")
@SpringBootApplication
public class PassjavaChannelApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaChannelApplication.class, args);
    }

}

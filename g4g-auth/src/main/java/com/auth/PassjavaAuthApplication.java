package com.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author tongyao
 */
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com"})
public class PassjavaAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaAuthApplication.class, args);
    }

}

package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import javax.sql.DataSource;

/**
 * @author tongyao
 */
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com"}, exclude = {DataSourceAutoConfiguration.class})
public class PassjavaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassjavaGatewayApplication.class, args);
    }

}

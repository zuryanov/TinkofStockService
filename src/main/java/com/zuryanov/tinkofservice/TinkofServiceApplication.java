package com.zuryanov.tinkofservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAsync
public class TinkofServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinkofServiceApplication.class, args);
    }

}

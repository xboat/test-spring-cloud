package com.example.eureka.zero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaZeroApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZeroApplication.class, args);
    }
}

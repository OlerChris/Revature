package com.Revature.MessagingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class MessagingServiceApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "properties/MessagingService");
        SpringApplication.run(MessagingServiceApplication.class, args);
    }
}

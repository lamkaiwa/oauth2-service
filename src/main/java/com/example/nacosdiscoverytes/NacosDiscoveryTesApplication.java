package com.example.nacosdiscoverytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryTesApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryTesApplication.class, args);
    }
}

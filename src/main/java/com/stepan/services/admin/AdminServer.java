package com.stepan.services.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Michal on 17.12.2016.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AdminServer {

    public static final String POKLADNA_SERVICE_URL = "http://POKLADNA-SERVICE";

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "admin-server");
        SpringApplication.run(AdminServer.class, args);
    }

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

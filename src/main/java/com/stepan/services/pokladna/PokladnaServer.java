package com.stepan.services.pokladna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Michal on 17.12.2016.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PokladnaServer {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "pokladna-server");
        SpringApplication.run(PokladnaServer.class, args);
    }
}

package com.yanle.legou.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LegouStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegouStoreApplication.class, args);
    }
}

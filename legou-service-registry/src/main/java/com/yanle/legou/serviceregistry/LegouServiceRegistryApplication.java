package com.yanle.legou.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LegouServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegouServiceRegistryApplication.class, args);
    }
}

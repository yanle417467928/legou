package com.yanle.legou.servicerouter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class LegouServiceRouterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegouServiceRouterApplication.class, args);
    }
}

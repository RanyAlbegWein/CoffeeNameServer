package com.rany.coffeenameserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CoffeeNameServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoffeeNameServerApplication.class, args);
    }

}

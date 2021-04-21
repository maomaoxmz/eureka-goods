package com.ny.army.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGoodsApplication.class, args);
    }

}

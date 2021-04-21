package com.ny.army.goods.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    private final Environment environment;

    public GoodsController(Environment environment) {
        this.environment = environment;
    }

    private String getPort(){
        return environment.getProperty("local.server.port");
    }


//    当一个服务注册到eureka多个节点的时候
//    eureka会自动负载均衡
    @GetMapping("/selectList")
    public String select() throws InterruptedException {
        return getPort() + ": [商品1,商品2]";
    }
}

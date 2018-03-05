package com.abrab.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class MicroserviceGatewayZuulApplication {

//    @Value("${global}")
//    private String testConf;
//
//    @GetMapping("/conf")
//    public String testConf() {
//        return testConf;
//    }

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGatewayZuulApplication.class, args);
    }


}

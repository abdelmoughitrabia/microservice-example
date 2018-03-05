package com.abrab.apiconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.abrab.apiconsumer.client")
@EnableHystrix
public class ApiConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ApiConsumerApplication.class, args);
    }

}


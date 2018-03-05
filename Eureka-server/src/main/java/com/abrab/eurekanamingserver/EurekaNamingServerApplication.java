package com.abrab.eurekanamingserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaNamingServerApplication {

//    @Value("${global}")
//    private String testConf;
//
//    @GetMapping("/conf")
//    public String testConf() {
//        return testConf;
//    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaNamingServerApplication.class, args);
    }
}

package com.abrab.apisource;

import com.abrab.apisource.domain.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiSourceApplication.class, args);
    }

}


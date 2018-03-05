package com.abrab.apiconsumer.client;


import com.abrab.apiconsumer.config.ClientConfig;
import com.abrab.apiconsumer.dto.Data;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@Primary
@FeignClient(value = "producer-service")
//@RibbonClient(name = "producer-service", configuration = ClientConfig.class)
public interface Client {
    @GetMapping("/data")
    List<Data> getData();
}
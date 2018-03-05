package com.abrab.apiconsumer.client.impl;

import com.abrab.apiconsumer.dto.Data;
import com.abrab.apiconsumer.client.Client;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ClientBean implements Client {

    @Autowired
    private Client client;

    @HystrixCommand(fallbackMethod = "defaultGetData")
    public List<Data> getData() {
        return client.getData();
    }

    public List<Data> defaultGetData() {
        System.out.println("fallback methode=================>defaultGetData");
        return new ArrayList<>();
    }
}

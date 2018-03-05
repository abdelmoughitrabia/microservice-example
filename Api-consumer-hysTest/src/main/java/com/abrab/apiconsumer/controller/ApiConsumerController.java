package com.abrab.apiconsumer.controller;

import com.abrab.apiconsumer.dto.Data;
import com.abrab.apiconsumer.client.impl.ClientBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiConsumerController {

    @Autowired
    private ClientBean clientBean;


    @GetMapping("/data")
    public List<Data> getData() {
        return clientBean.getData();
    }
}

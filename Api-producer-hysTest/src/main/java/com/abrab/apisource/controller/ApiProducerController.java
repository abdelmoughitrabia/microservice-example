package com.abrab.apisource.controller;

import com.abrab.apisource.domain.Data;
import com.abrab.apisource.repository.DataSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiProducerController {

    @GetMapping("/data")
    public List<Data> getData() {
        return DataSource.getData();
    }
}

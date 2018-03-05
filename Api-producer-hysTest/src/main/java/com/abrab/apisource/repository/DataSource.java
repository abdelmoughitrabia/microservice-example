package com.abrab.apisource.repository;

import com.abrab.apisource.domain.Data;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Data> getData() {
        List<Data> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) dataList.add(new Data("data" + i));
        return dataList;
    }
}

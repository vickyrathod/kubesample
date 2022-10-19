package com.backend.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class WeatherApiResponse {
    private String cod;
    private int message;
    private int cnt;
    private ArrayList<DataList> list;
    private City city;
}

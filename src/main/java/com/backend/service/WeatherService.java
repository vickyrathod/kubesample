package com.backend.service;

import com.backend.exception.ApiException;
import com.backend.model.WeatherPrediction;

import java.util.List;

public interface WeatherService {

    List<WeatherPrediction> getWeatherData(String city) throws ApiException;

}

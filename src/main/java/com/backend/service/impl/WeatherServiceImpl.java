package com.backend.service.impl;

import com.backend.model.WeatherPrediction;
import com.backend.weather.WeatherForecast;
import com.backend.exception.ApiException;
import com.backend.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    WeatherForecast weatherForecast;

    @Cacheable(value = "weatherData", key = "#city")
    @Override
    public List<WeatherPrediction> getWeatherData(String city) throws ApiException {
        return weatherForecast.getPrediction(city);
    }
}

package com.backend.weather;

import com.backend.exception.ApiException;
import com.backend.model.WeatherApiResponse;
import com.backend.model.WeatherPrediction;

import java.util.List;
import java.util.Optional;

public interface IForecast {


    int THUNDERSTORM_START_ID = 200;
    int RAIN_START_ID = 500;

    List<WeatherPrediction> getPrediction(String city) throws ApiException;

    int getRecordCount();

    Optional<WeatherApiResponse> getDataFromApi(String city, int recordCount) throws ApiException;
}

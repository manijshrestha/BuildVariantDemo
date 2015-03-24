package com.manijshrestha.buildvariantdemo.service;

import com.manijshrestha.buildvariantdemo.model.WeatherData;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by manijshrestha on 3/21/15.
 */
public interface OpenWeatherService {

    @GET("/data/2.5/weather")
    public void getWeatherData(@Query("q")String cityName, @Query("units") String unit, Callback<WeatherData> onWeatherData);
}

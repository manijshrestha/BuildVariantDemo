package com.manijshrestha.buildvariantdemo.service;

import com.manijshrestha.buildvariantdemo.model.WeatherData;

public interface WeatherListener {
    public void onWeatherData(WeatherData data);

    public void onNoWeatherData();
}
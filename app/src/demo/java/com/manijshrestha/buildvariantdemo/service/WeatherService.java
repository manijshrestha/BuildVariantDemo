package com.manijshrestha.buildvariantdemo.service;

import com.manijshrestha.buildvariantdemo.model.WeatherData;

/**
 * Weather service that uses canned data
 */
public class WeatherService {

    private WeatherListener mListener;

    public WeatherService(WeatherListener listener) {
        this.mListener = listener;
    }

    public void getWeather(String cityName) {
        if (cityName.equalsIgnoreCase("bermuda")) {
            mListener.onNoWeatherData();
        } else {
            WeatherData weatherData = new WeatherData();
            WeatherData.MainData mainInfo = new WeatherData.MainData();
            mainInfo.setTemp("75.00");
            weatherData.setMain(mainInfo);
            mListener.onWeatherData(weatherData);
        }
    }
}

package com.manijshrestha.buildvariantdemo.service;

import com.manijshrestha.buildvariantdemo.model.WeatherData;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Weather service that uses Retrofit to get the weather data
 *
 */
public class WeatherService {

    private WeatherListener mListener;

    public WeatherService(WeatherListener listener) {
        this.mListener = listener;
    }

    public void getWeather(String cityName) {
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint("http://api.openweathermap.org").build();
        OpenWeatherService openWeatherService = adapter.create(OpenWeatherService.class);

        openWeatherService.getWeatherData(cityName, "imperial", new Callback<WeatherData>() {
            @Override
            public void success(WeatherData weatherData, Response response) {
                mListener.onWeatherData(weatherData);
            }

            @Override
            public void failure(RetrofitError error) {
                mListener.onNoWeatherData();
            }
        });
    }
}

package com.manijshrestha.buildvariantdemo.model;

/**
 * Sample Weather Data object that confirms to JSON provided by
 *
 * http://api.openweathermap.org/data/2.5/weather
 */
public class WeatherData {

    private MainData main;

    public MainData getMain() {
        return main;
    }

    public void setMain(MainData main) {
        this.main = main;
    }

    public static class MainData {
        private String temp;

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }
    }
}

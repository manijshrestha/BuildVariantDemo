package com.manijshrestha.buildvariantdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.manijshrestha.buildvariantdemo.model.WeatherData;
import com.manijshrestha.buildvariantdemo.service.WeatherListener;
import com.manijshrestha.buildvariantdemo.service.WeatherService;

public class MainActivity extends ActionBarActivity implements WeatherListener {

    private EditText mCityName;
    private TextView mTemperature;
    private WeatherService mWeatherService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCityName = (EditText) findViewById(R.id.location_name);
        mTemperature = (TextView) findViewById(R.id.temperature);
        mWeatherService = new WeatherService(this);
    }

    public void findWeather(View view) {
        mWeatherService.getWeather(mCityName.getText().toString());
    }

    @Override
    public void onWeatherData(WeatherData weather) {
        mTemperature.setText(weather.getMain().getTemp());
    }

    @Override
    public void onNoWeatherData() {
        Toast.makeText(this, "Sorry No Weather Data", Toast.LENGTH_SHORT).show();
    }
}

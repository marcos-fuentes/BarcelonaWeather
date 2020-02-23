package com.example.service.repository

import androidx.lifecycle.LiveData
import com.example.service.model.currentweather.WeatherResponse
import com.example.service.model.forecastweather.ForecastWeatherResponse

interface WeatherRepository {
    fun getWeatherFromCity(cityName: String, units:String, appid: String): LiveData<WeatherResponse>
    fun getForecastWeatherFromCity(cityName: String, daysNumber:Int, units:String, appid: String): LiveData<ForecastWeatherResponse>
}
package com.example.service.repository

import androidx.lifecycle.LiveData
import com.example.service.model.currentweather.WeatherResponse

interface WeatherRepository {
    fun getWeatherFromCity(cityName: String, appid: String): LiveData<WeatherResponse>
    fun getForecastWeatherFromCity(cityName: String, daysNumber:Int, appid: String): LiveData<WeatherResponse>
}
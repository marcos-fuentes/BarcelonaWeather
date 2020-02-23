package com.example.service.repository

import androidx.lifecycle.LiveData
import com.example.service.model.WeatherResponse

interface WeatherRepository {
    fun getWeatherFromCity(cityName: String, appid: String): LiveData<WeatherResponse>
}
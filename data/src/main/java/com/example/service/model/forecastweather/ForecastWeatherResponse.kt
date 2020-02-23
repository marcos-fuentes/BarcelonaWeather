package com.example.service.model.forecastweather

import com.example.service.model.forecastweather.City

data class ForecastWeatherResponse (
    val cod: String,
    val message: String,
    val city: City,
    val cnt: Long,
    val list: List<ForecastElement>
)
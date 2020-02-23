package com.example.presentation.model.forecastweather

import com.example.service.model.forecastweather.City

data class ForecastWeatherLocal (
    val cod: String,
    val message: String,
    val city: CityLocal,
    val cnt: Long,
    val list: List<ForecastElementLocal>
)
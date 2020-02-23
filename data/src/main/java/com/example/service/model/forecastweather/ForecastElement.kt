package com.example.service.model.forecastweather

data class ForecastElement(
    val dt: Long,
    val temp: Temp,
    val pressure: Double,
    val humidity: Long,
    val weather: List<Weather>,
    val speed: Double,
    val deg: Long,
    val clouds: Long,
    val snow: Double? = null
)
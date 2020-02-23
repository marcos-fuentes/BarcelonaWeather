package com.example.presentation.model.forecastweather

data class ForecastElementLocal(
    val dt: Long,
    val temp: TempLocal,
    val pressure: Double,
    val humidity: Long,
    val weather: List<WeatherLocal>,
    val speed: Double,
    val deg: Long,
    val clouds: Long,
    val snow: Double? = null
)
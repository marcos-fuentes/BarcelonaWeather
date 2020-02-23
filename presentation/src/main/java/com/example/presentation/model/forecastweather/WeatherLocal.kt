package com.example.presentation.model.forecastweather

data class WeatherLocal (
    val id: Long,
    val main: String,
    val description: String,
    val icon: String
)
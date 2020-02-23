package com.example.service.model.currentweather

data class WeatherElement (
    val id: Long,
    val main: String,
    val description: String,
    val icon: String
)
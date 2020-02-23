package com.example.service.model.forecastweather

data class Weather (
    val id: Long,
    val main: String,
    val description: String,
    val icon: String
)
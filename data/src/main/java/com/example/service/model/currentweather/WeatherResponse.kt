package com.example.service.model.currentweather

data class WeatherResponse (
    val coord: Coord,
    val weather: List<WeatherElement>,
    val base: String,
    val main: Main,
    val visibility: Long,
    val wind: Wind,
    val clouds: Clouds,
    val dt: Long,
    val sys: Sys,
    val timezone: Long,
    val id: Long,
    val name: String,
    val cod: Long
)
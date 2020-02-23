package com.example.presentation.model.currentweather

import com.example.service.model.*

data class WeatherLocal(
    val coord: CoordLocal,
    val weather: List<WeatherElementLocal>,
    val base: String,
    val main: MainLocal,
    val visibility: Long,
    val wind: WindLocal,
    val clouds: CloudsLocal,
    val dt: Long,
    val sys: SysLocal,
    val timezone: Long,
    val id: Long,
    val name: String,
    val cod: Long
)
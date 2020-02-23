package com.example.presentation.model.currentweather

import com.example.service.model.*

data class WeatherLocal(
    var coord: CoordLocal,
    var weather: List<WeatherElementLocal>,
    var base: String,
    var main: MainLocal,
    var visibility: Long,
    var wind: WindLocal,
    var clouds: CloudsLocal,
    var dt: Long,
    var sys: SysLocal,
    var timezone: Long,
    var id: Long,
    var name: String,
    var cod: Long
)
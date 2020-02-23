package com.example.presentation.model.forecastweather

data class TempLocal(
    val day: Double,
    val min: Double,
    val max: Double,
    val night: Double,
    val eve: Double,
    val morn: Double
)
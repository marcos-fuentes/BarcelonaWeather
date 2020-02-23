package com.example.presentation.model.forecastweather

data class CityLocal (
    val geonameID: Long,
    val name: String,
    val lat: Double,
    val lon: Double,
    val country: String,
    val iso2: String,
    val type: String,
    val population: Long
)
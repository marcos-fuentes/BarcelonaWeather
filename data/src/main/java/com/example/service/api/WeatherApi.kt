package com.example.service.api

import androidx.annotation.IntegerRes
import androidx.core.provider.FontsContractCompat
import com.example.service.model.currentweather.WeatherResponse
import com.example.service.model.forecastweather.ForecastWeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    fun getWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String
    ): Call<WeatherResponse>

    @GET("forecast/daily")
    fun getForecastWeather(
        @Query("q") city: String,
        @Query("cnt") numberDays: Int,
        @Query("appid") apiKey: String
    ): Call<ForecastWeatherResponse>
}
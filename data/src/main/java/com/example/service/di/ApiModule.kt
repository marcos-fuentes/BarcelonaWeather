package com.example.service.di

import com.example.service.api.WeatherApi
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    single { get<Retrofit>().create(WeatherApi::class.java) }
}
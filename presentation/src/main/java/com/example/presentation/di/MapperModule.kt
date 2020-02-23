package com.example.presentation.di

import com.example.presentation.mapper.WeatherViewMapper
import org.koin.dsl.module

val viewMapperModule = module {
    single { WeatherViewMapper() }
}
package com.example.presentation.di

import com.example.presentation.mapper.CurrentWeatherViewMapper
import org.koin.dsl.module

val viewMapperModule = module {
    single { CurrentWeatherViewMapper() }
}
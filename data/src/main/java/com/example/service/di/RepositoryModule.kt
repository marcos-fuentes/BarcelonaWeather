package com.example.service.di

import com.example.service.repository.WeatherRepository
import com.example.service.repository.WeatherRepositoryImpl
import org.koin.core.module.Module
import org.koin.dsl.module

@JvmField
val repositoryModule: Module = module {
    single<WeatherRepository> {
        WeatherRepositoryImpl(
            get()
        )
    }
}


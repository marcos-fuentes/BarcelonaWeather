package com.example.presentation.di


import com.example.presentation.cityweather.viewmodel.WeatherViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        WeatherViewModel(get(), get())
    }
}
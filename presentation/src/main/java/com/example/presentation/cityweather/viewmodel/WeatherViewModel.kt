package com.example.presentation.cityweather.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.presentation.mapper.CurrentWeatherViewMapper
import com.example.presentation.model.currentweather.WeatherLocal
import com.example.service.repository.WeatherRepository


class WeatherViewModel(
    private val repository: WeatherRepository,
    private val mapper: CurrentWeatherViewMapper
) : ViewModel() {
    private var lvWeather: LiveData<WeatherLocal> = MutableLiveData()

    init {
        configLiveDataResponse()
    }

    private fun configLiveDataResponse() {
        val weatherFromCity =
            repository.getWeatherFromCity("Barcelona", "910f5ea26bec82460f30f8f815923218")

        lvWeather = Transformations.map(weatherFromCity) { input ->
            mapper.mapTo(input)
        }
    }

    fun getWeather():LiveData<WeatherLocal>{
        return lvWeather
    }
}
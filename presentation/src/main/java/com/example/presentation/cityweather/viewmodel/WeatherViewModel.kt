package com.example.presentation.cityweather.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.data2.BuildConfig.API_KEY
import com.example.presentation.mapper.CurrentWeatherViewMapper
import com.example.presentation.mapper.ForecastWeatherViewMapper
import com.example.presentation.model.currentweather.WeatherLocal
import com.example.presentation.model.forecastweather.ForecastWeatherLocal
import com.example.service.repository.WeatherRepository


class WeatherViewModel(
    private val repository: WeatherRepository,
    private val weatherViewMapper: CurrentWeatherViewMapper,
    private val forecastWeatherViewMapper: ForecastWeatherViewMapper

) : ViewModel() {
    private var lvWeather: LiveData<WeatherLocal> = MutableLiveData()
    private var lvForecast: LiveData<ForecastWeatherLocal> = MutableLiveData()

    init {
        configLiveDataResponse()
    }

    private fun configLiveDataResponse() {
        val weatherFromCity =
            repository.getWeatherFromCity("Barcelona","metric", API_KEY)

        lvWeather = Transformations.map(weatherFromCity) { input ->
            weatherViewMapper.mapTo(input)
        }


        var forecastWeatherFromCity = repository.getForecastWeatherFromCity(
            "Barcelona",
            10,
            "metric",
            API_KEY
        )
        lvForecast = Transformations.map(forecastWeatherFromCity) { input ->
            forecastWeatherViewMapper.mapTo(input)
        }
    }

    fun getWeather(): LiveData<WeatherLocal> {
        return lvWeather
    }

    fun getForecastWeather(): LiveData<ForecastWeatherLocal> {
        return lvForecast
    }
}
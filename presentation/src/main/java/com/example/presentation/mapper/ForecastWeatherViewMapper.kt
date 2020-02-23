package com.example.presentation.mapper

import com.example.presentation.model.forecastweather.*
import com.example.service.model.forecastweather.*

class ForecastWeatherViewMapper {
    fun mapTo(forecastWeatherResponse: ForecastWeatherResponse): ForecastWeatherLocal {
        return ForecastWeatherLocal(
            forecastWeatherResponse.cod,
            forecastWeatherResponse.message,
            cityMapper(forecastWeatherResponse.city),
            forecastWeatherResponse.cnt,
            forecastElementListMapper(forecastWeatherResponse.list)
        )
    }

    private fun cityMapper(city: City) = CityLocal(
        city.geonameID,
        city.name,
        city.lat,
        city.lon,
        city.country,
        city.iso2,
        city.type,
        city.population
    )


    private fun forecastElementListMapper(forecastElementList: List<ForecastElement>): List<ForecastElementLocal> {
        val forecastList: ArrayList<ForecastElementLocal> = ArrayList()

        for (forecastElement in forecastElementList) {
            forecastList.add(forecastElementMapper(forecastElement))
        }

        return forecastList
    }

    private fun forecastElementMapper(forecastElement: ForecastElement) = ForecastElementLocal(
        forecastElement.dt,
        tempMapper(forecastElement.temp),
        forecastElement.pressure,
        forecastElement.humidity,
        weatherMapper(forecastElement.weather),
        forecastElement.speed,
        forecastElement.deg,
        forecastElement.clouds,
        forecastElement.snow
    )

    private fun tempMapper(temp: Temp): TempLocal {
        return TempLocal(
            temp.day,
            temp.min,
            temp.max,
            temp.night,
            temp.eve,
            temp.morn
        )
    }

    private fun weatherMapper(weatherList: List<Weather>): List<WeatherLocal> {
        val weatherLocalList: ArrayList<WeatherLocal> = ArrayList()

        for (weather in weatherList) {
            weatherLocalList.add(
                WeatherLocal(
                    weather.id,
                    weather.main,
                    weather.description,
                    weather.icon
                )
            )
        }
        return weatherLocalList
    }
}
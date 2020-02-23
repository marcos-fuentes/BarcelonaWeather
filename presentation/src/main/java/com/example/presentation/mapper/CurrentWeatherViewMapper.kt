package com.example.presentation.mapper

import com.example.presentation.model.currentweather.WeatherLocal
import com.example.service.model.*
import com.example.service.model.currentweather.*

class CurrentWeatherViewMapper {
    fun mapTo(weatherResponse: WeatherResponse): WeatherLocal {
        return WeatherLocal(
            coordMapper(weatherResponse.coord),
            weatherElementListMapper(weatherResponse.weather),
            weatherResponse.base,
            mainMapper(weatherResponse.main),
            weatherResponse.visibility,
            windMapper(weatherResponse.wind),
            cloudMapper(weatherResponse.clouds),
            weatherResponse.dt,
            sysMapper(weatherResponse.sys),
            weatherResponse.timezone,
            weatherResponse.id,
            weatherResponse.name,
            weatherResponse.cod
        )
    }

    private fun coordMapper(coord: Coord) = CoordLocal(coord.lon, coord.lat)

    private fun cloudMapper(clouds: Clouds) = CloudsLocal(clouds.all)

    private fun mainMapper(main: Main) = MainLocal(
        main.temp,
        main.feelsLike,
        main.tempMin,
        main.tempMax,
        main.pressure,
        main.humidity
    )

    private fun sysMapper(sys: Sys) =
        SysLocal(sys.type, sys.id, sys.message, sys.country, sys.sunrise, sys.sunset)

    private fun weatherElementListMapper(weatherElementList: List<WeatherElement>): List<WeatherElementLocal> {
        val weatherList: ArrayList<WeatherElementLocal> = ArrayList()

        for (weatherElement in weatherElementList) {
            weatherList.add(weatherElementMapper(weatherElement))
        }

        return weatherList
    }

    private fun weatherElementMapper(weatherElement: WeatherElement) = WeatherElementLocal(
        weatherElement.id,
        weatherElement.main,
        weatherElement.description,
        weatherElement.icon
    )

    private fun windMapper(wind: Wind) = WindLocal(wind.speed, wind.deg)

}
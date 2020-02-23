package com.example.presentation.cityweather

import com.example.presentation.R

object ImageHelper {
    fun getImageOfWeather(iconName: String): Int {
        when (iconName) {
            "01d" -> return R.drawable.weather01d
            "02d" -> return R.drawable.weather02d
            "03d" -> return R.drawable.weather03d
            "04d" -> return R.drawable.weather04d
            "09d" -> return R.drawable.weather09d
            "10d" -> return R.drawable.weather10d
            "11d" -> return R.drawable.weather11d
            "13d" -> return R.drawable.weather13d
            "50d" -> return R.drawable.weather50d
        }
        return R.drawable.weather01d
    }
}
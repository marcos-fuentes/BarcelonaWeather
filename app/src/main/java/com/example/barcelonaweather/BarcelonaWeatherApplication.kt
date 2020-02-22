package com.example.barcelonaweather

import android.app.Application
import com.example.mvvmcurrencyconverter.di.KoinHelper.startKoin

class BarcelonaWeatherApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this)

    }


}
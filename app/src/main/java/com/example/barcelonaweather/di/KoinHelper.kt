package com.example.barcelonaweather.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

object KoinHelper {
    @JvmStatic
    fun startKoin(application: Application) {
        startKoin {
            androidContext(application)
            androidLogger(Level.DEBUG)
            modules(
                listOf(
                    //MODULE DEFINITION
                )
            )
        }
    }
}
package com.example.barcelonaweather.di

import android.app.Application
import com.example.presentation.di.viewMapperModule
import com.example.presentation.di.viewModelModule
import com.example.service.di.apiModule
import com.example.service.di.netModule
import com.example.service.di.repositoryModule
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
                    netModule,
                    apiModule,
                    repositoryModule,
                    viewModelModule,
                    viewMapperModule
                )
            )
        }
    }
}
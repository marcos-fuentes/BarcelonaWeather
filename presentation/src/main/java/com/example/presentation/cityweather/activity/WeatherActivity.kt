package com.example.presentation.cityweather.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.presentation.R
import com.example.presentation.cityweather.viewmodel.WeatherViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class WeatherActivity : AppCompatActivity() {
    private val weatherViewModel by viewModel<WeatherViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weather_activity)
    }

    override fun onStart() {
        super.onStart()
        observeViewModel()
    }

    fun observeViewModel() {
        weatherViewModel.getWeather().observe(this, Observer {
            var it1 = it
            println(it1)
        })


        weatherViewModel.getForecastWeather().observe(this, Observer {
            var it1 = it
            println(it1)
        })
    }
}
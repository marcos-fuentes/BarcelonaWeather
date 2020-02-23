package com.example.presentation.cityweather.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.presentation.R
import com.example.presentation.cityweather.adapter.ForecastAdapter
import com.example.presentation.cityweather.viewmodel.WeatherViewModel
import com.example.presentation.model.forecastweather.ForecastElementLocal
import kotlinx.android.synthetic.main.weather_activity.*
import org.koin.android.viewmodel.ext.android.viewModel

class WeatherActivity : AppCompatActivity() {
    private val weatherViewModel by viewModel<WeatherViewModel>()
    private var forecastList: List<ForecastElementLocal> = ArrayList()
    private var forecastAdapter: ForecastAdapter = ForecastAdapter(
        this,
        forecastList
    )

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
            forecastList = it.list
          updateRecyclerViewList()
        })
    }

    private fun updateRecyclerViewList() {
        forecastAdapter = ForecastAdapter(
            this,
            forecastList
        )

        rvForecastWeather.layoutManager = GridLayoutManager(this, 5)
        rvForecastWeather.adapter = forecastAdapter
        forecastAdapter.notifyDataSetChanged()
    }
}
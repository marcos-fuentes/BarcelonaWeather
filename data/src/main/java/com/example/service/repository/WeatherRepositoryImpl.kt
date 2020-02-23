package com.example.service.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.service.api.WeatherApi
import com.example.service.model.WeatherResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WeatherRepositoryImpl(private val weatherApi: WeatherApi) : WeatherRepository {
    private val TAG: String = this::class.java.simpleName
    override fun getWeatherFromCity(cityName: String, appid: String): LiveData<WeatherResponse> {
        val data: MutableLiveData<WeatherResponse> = MutableLiveData()
        weatherApi.getWeather(cityName, appid)
            .enqueue(object : Callback<WeatherResponse?> {
                override fun onResponse(
                    call: Call<WeatherResponse?>,
                    response: Response<WeatherResponse?>
                ) {
                    Log.d(
                        TAG,
                        "onResponse response:: $response"
                    )
                    if (response.body() != null) {
                        data.value = response.body()
                    }
                }

                override fun onFailure(
                    call: Call<WeatherResponse?>,
                    t: Throwable
                ) {
                    data.value = null
                }
            })
        return data
    }

}
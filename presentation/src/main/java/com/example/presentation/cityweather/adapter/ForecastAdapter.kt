package com.example.presentation.cityweather.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.presentation.R
import com.example.presentation.cityweather.ImageHelper
import com.example.presentation.model.forecastweather.ForecastElementLocal
import kotlinx.android.synthetic.main.weather_item_list.view.*
import java.util.*

class ForecastAdapter(
    var context: Context?,
    var forecastWeatherLocal: List<ForecastElementLocal>
) : RecyclerView.Adapter<ForecastAdapter.ForeCastViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForeCastViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.weather_item_list, parent, false)
        return ForeCastViewHolder(view)
    }

    override fun onBindViewHolder(holder: ForeCastViewHolder, position: Int) {
        holder.bind(forecastWeatherLocal[position])
    }

    override fun getItemCount(): Int {
        return forecastWeatherLocal.size
    }

    inner class ForeCastViewHolder
        (itemView: View) :
        RecyclerView.ViewHolder(itemView) {


        fun bind(forecastElementLocal: ForecastElementLocal) {
            itemView.forecastTemp.text = forecastElementLocal.temp.day.toInt().toString() + " ºC"
            itemView.forecastWeatherIcon.setImageResource(
                ImageHelper.getImageOfWeather(
                    forecastElementLocal.weather[0].icon
                )
            )
        }
    }
}
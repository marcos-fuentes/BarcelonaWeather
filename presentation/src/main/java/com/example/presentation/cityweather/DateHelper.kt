package com.example.presentation.cityweather

import android.os.Build
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

object DateHelper {
    fun getDayOfWeekPlusThreeLetterFormat(plus: Long): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val day = LocalDate.now().plus(plus, ChronoUnit.DAYS)
            day.format(DateTimeFormatter.ofPattern("EEE", Locale.ENGLISH)).toUpperCase()
        } else {
            ""
        }
    }

    fun getDayOfTheWeek(): String{
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val day = LocalDate.now()
            day.format(DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH))
        } else {
            ""
        }
    }
}
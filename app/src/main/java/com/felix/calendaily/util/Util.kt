package com.felix.calendaily.util

import java.util.*

/**
 * Created by Felix on 10/04/2018.
 */

open class Util {

    companion object {

        fun getTitleDate(date: Date): String {
            val calendar = Calendar.getInstance()
            calendar.time = date

            val dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())
            val month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            return "${capitalize(dayOfWeek)} $day, ${capitalize(month)}"
        }

        fun capitalize(value: String): String {
            return value.substring(0, 1).toUpperCase() + value.substring(1)
        }

        fun getMonthTitle(date: Date): String {
            val calendar = Calendar.getInstance()
            calendar.time = date

            val month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())

            return capitalize(month)
        }

        fun getYearTitle(date: Date): String {
            val calendar = Calendar.getInstance()
            calendar.time = date
            return "${calendar.get(Calendar.YEAR)}"
        }

    }

}

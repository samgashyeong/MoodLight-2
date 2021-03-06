package com.example.moodlight.screen.main2.calendar

import android.util.Log
import android.view.View
import java.util.*

class CalendarHelper {

    private var calendar = Calendar.getInstance()
    // month 0λΆν° μμ.

    fun plusMonth () {
        calendar.add(Calendar.MONTH, 1)
    }

    fun minusMonth () {
        calendar.add(Calendar.MONTH, -1)
    }

    fun getMonth () : Int {
        return calendar.get(Calendar.MONTH)
    }

    fun getYear () : Int {
        return calendar.get(Calendar.YEAR)
    }

    fun getDate () : Int {
        return calendar.get(Calendar.DATE)
    }

    fun getStartDayOfWeek (): Int {
        val cal : Calendar = calendar
        cal.set(Calendar.DAY_OF_MONTH, 1)
        return cal.get(Calendar.DAY_OF_WEEK)
    }

    fun getEndDay () : Int {
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
    }

    fun getEndDayOfWeek () : Int {
        val cal : Calendar = calendar
        cal.set(Calendar.DAY_OF_MONTH, getEndDay())

        return cal.get(Calendar.DAY_OF_WEEK)
    }

    fun getLastEndDay(): Int {
        val cal2 :Calendar = calendar
        cal2.add(Calendar.MONTH, -1)
        return cal2.getActualMaximum(Calendar.DAY_OF_MONTH)
    }



}
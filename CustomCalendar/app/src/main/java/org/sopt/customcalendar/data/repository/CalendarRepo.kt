package org.sopt.customcalendar.data.repository

import androidx.lifecycle.LiveData
import org.sopt.customcalendar.data.entity.CalendarData

interface CalendarRepo {
    fun getCalendarDataAll(): LiveData<List<CalendarData>>
}
package org.sopt.customcalendar.data.repository

import androidx.lifecycle.LiveData
import org.sopt.customcalendar.data.dao.CalendarDao
import org.sopt.customcalendar.data.entity.CalendarData
import javax.inject.Inject

class CalendarRepoImpl@Inject constructor(private val calendarDao: CalendarDao) : CalendarRepo {
    override fun getCalendarDataAll(): LiveData<List<CalendarData>> {
        TODO("Not yet implemented")
    }
}
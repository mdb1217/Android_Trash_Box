package org.sopt.customcalendar.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import org.sopt.customcalendar.data.entity.CalendarData

@Dao
interface CalendarDao {
    @Query("SELECT * FROM calendar_data_table")
    fun getAll(): LiveData<List<CalendarData>>
}
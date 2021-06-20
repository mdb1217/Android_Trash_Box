package org.sopt.customcalendar.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import org.sopt.customcalendar.data.dao.CalendarDao
import org.sopt.customcalendar.data.entity.CalendarData

@Database(entities = [CalendarData::class], version = 1)
abstract class LocalDatabase : RoomDatabase(){
    abstract val calendarDao : CalendarDao
}
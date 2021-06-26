package org.sopt.customcalendar.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import org.sopt.customcalendar.data.converter.Converter
import java.util.*

@Entity(tableName = "calendar_data_table")
@TypeConverters(Converter::class)
data class CalendarData(
    @PrimaryKey(autoGenerate = true)
    val id: Long?,

    @ColumnInfo(name = "date")
    val date: Calendar,

    @ColumnInfo(name = "todo")
    val todo: String
)

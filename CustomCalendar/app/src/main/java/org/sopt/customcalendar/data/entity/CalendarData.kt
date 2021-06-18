package org.sopt.customcalendar.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "calendar_data_table")
data class CalendarData(
    @PrimaryKey(autoGenerate = true)
    val id: Long?,

    @ColumnInfo(name = "name")
    val name: String,
)

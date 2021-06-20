package org.sopt.customcalendar.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import org.sopt.customcalendar.data.dao.CalendarDao
import org.sopt.customcalendar.data.database.LocalDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {
    @Provides
    @Singleton
    fun provideLocalDatabase(@ApplicationContext context: Context): LocalDatabase =
        Room.databaseBuilder(
            context,
            LocalDatabase::class.java,
            "local database"
        ).fallbackToDestructiveMigration()
            .build()

    @Provides
    fun provideProfileDao(database: LocalDatabase): CalendarDao = database.calendarDao
}
package org.sopt.customcalendar.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.sopt.customcalendar.data.dao.CalendarDao
import org.sopt.customcalendar.data.repository.CalendarRepo
import org.sopt.customcalendar.data.repository.CalendarRepoImpl
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    @Singleton
    fun calendarRepo(
        calendarDao: CalendarDao
    ) : CalendarRepo = CalendarRepoImpl(calendarDao)
}
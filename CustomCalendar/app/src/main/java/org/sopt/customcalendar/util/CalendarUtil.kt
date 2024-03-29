package org.sopt.customcalendar.util

import java.text.SimpleDateFormat
import java.util.*

object CalendarUtil {
    private val simpleDateFormat = SimpleDateFormat("yy년 MM월", Locale.KOREA)

    fun convertCalendarToString(calendar: Calendar): String = simpleDateFormat.format(calendar.time)

    fun convertCalendarToString(year: Int, month: Int, day: Int): String {
        val calendar = Calendar.getInstance()
        calendar.set(year, month, day)
        return simpleDateFormat.format(calendar.time)
    }

    fun Calendar.compareDateTo(c1: Calendar): Boolean {
        return get(Calendar.YEAR) == c1.get(Calendar.YEAR)
                && get(Calendar.MONTH) == c1.get(Calendar.MONTH)
                && get(Calendar.DAY_OF_MONTH) == c1.get(Calendar.DAY_OF_MONTH)
    }

    fun Calendar.isWeekSame(c1: Calendar): Boolean {
        return get(Calendar.YEAR) == c1.get(Calendar.YEAR)
                && get(Calendar.MONTH) == c1.get(Calendar.MONTH)
                && get(Calendar.WEEK_OF_MONTH) == c1.get(Calendar.WEEK_OF_MONTH)
    }

    fun Calendar.copyYMDFrom(c1: Calendar) {
        set(c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DATE))
    }
}
package org.sopt.customcalendar.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import org.sopt.customcalendar.R
import org.sopt.customcalendar.data.entity.CalendarData
import org.sopt.customcalendar.databinding.LayoutCalendarBinding
import org.sopt.customcalendar.ui.custom.adapter.CalendarAdapter
import org.sopt.customcalendar.util.CalendarUtil.convertCalendarToString
import java.util.*

class CustomCalendar(
    context: Context
    , attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {
    private val calendarAdapter = CalendarAdapter()
    private val dateList = mutableListOf<CalendarData>()
    private val nowCalendar = Calendar.getInstance(Locale.KOREA)
    private lateinit var layoutCalendarBinding : LayoutCalendarBinding
    //private var monthConvertListener: (() -> Unit)? = null
    init {
        addView(createMonthView())
    }


    private fun createMonthView(): View {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        layoutCalendarBinding =
            DataBindingUtil.inflate(inflater, R.layout.layout_calendar, this, false)

        layoutCalendarBinding.apply {
            tvMonth.text = convertCalendarToString(nowCalendar)
            rvCalendar.adapter = calendarAdapter
        }

        setCalendar()
        initClickEvent()

        return layoutCalendarBinding.root
    }

    private fun initClickEvent() {
        layoutCalendarBinding.apply {
            ibNextMonth.setOnClickListener {
                nowCalendar.add ( Calendar.MONTH, 1 )
                tvMonth.text = convertCalendarToString(nowCalendar)
                setCalendar()
            }
            ibPrevMonth.setOnClickListener {
                nowCalendar.add ( Calendar.MONTH, -1 )
                tvMonth.text = convertCalendarToString(nowCalendar)
                setCalendar()
            }
        }
    }

    private fun setCalendar() {
        dateList.clear()
        for(i in 1..nowCalendar.getActualMaximum(Calendar.DAY_OF_MONTH))
            dateList.add(CalendarData(null, "hi"))

        calendarAdapter.data = dateList
    }

}
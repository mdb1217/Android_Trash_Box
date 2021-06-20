package org.sopt.customcalendar.ui.custom.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sopt.customcalendar.data.entity.CalendarData
import org.sopt.customcalendar.databinding.ItemDateBinding

class CalendarAdapter : RecyclerView.Adapter<CalendarAdapter.CalendarViewHolder>() {
    private val _data = mutableListOf<CalendarData>()
    var data : List<CalendarData> = _data
        set(value) {
            _data.clear()
            _data.addAll(value)
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = _data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val binding = ItemDateBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)

        return CalendarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.bind(_data[position], position)
    }

    class CalendarViewHolder(private val binding: ItemDateBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(calendarData: CalendarData, position : Int) {
            if(calendarData.name == "bye")
                binding.clDate.visibility = View.INVISIBLE

            binding.tvDay.text = calendarData.name
        }
    }

}
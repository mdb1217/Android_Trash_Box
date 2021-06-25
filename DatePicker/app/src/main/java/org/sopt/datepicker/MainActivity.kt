package org.sopt.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.sopt.datepicker.custom.DatePickerFragment
import org.sopt.datepicker.custom.TimePickerFragment
import org.sopt.datepicker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnTime.setOnClickListener {
            showTimePickerDialog()
        }

        binding.btnDate.setOnClickListener {
            showDatePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        TimePickerFragment().show(supportFragmentManager, "timePicker")
    }

    private fun showDatePickerDialog() {
        DatePickerFragment().show(supportFragmentManager, "datePicker")
    }
}
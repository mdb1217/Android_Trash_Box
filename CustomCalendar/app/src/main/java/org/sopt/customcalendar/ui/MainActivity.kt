package org.sopt.customcalendar.ui

import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import org.sopt.customcalendar.R
import org.sopt.customcalendar.databinding.ActivityMainBinding
import org.sopt.customcalendar.ui.base.BindingActivity
import org.sopt.customcalendar.ui.viewmodel.MainViewModel

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding, MainViewModel>() {
    override val layoutResourceId: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModels()

    override fun initView() {

    }

    override fun initBeforeBinding() {

    }

    override fun initAfterBinding() {

    }
}
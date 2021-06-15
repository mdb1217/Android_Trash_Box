package org.sopt.customcalendar.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BindingActivity<T : ViewDataBinding, R : ViewModel> : AppCompatActivity(){
    lateinit var binding: T

    abstract val layoutResourceId: Int

    abstract val viewModel: R

    /**
     * initiate view and click event
     */
    abstract fun initView()

    /**
     * initiate viewmodel, lifecyclerowner and something else..
     */
    abstract fun initBeforeBinding()

    /**
     * initiate others (ex. observe Livedata)
     */
    abstract fun initAfterBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutResourceId)

        initView()
        initBeforeBinding()
        initAfterBinding()
    }
}
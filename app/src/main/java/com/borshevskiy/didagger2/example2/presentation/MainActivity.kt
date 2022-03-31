package com.borshevskiy.didagger2.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.borshevskiy.didagger2.R
import com.borshevskiy.didagger2.example2.di.ContextModule
import com.borshevskiy.didagger2.example2.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy { DaggerAppComponent.builder().contextModule(ContextModule(application)).build() }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}
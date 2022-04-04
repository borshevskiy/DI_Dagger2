package com.borshevskiy.didagger2.example2

import android.app.Application
import com.borshevskiy.didagger2.example2.di.DaggerAppComponent

class MyApp: Application() {

    val component by lazy { DaggerAppComponent.factory().create(this,System.currentTimeMillis()) }
}
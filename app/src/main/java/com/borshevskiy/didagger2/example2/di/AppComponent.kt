package com.borshevskiy.didagger2.example2.di

import com.borshevskiy.didagger2.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}
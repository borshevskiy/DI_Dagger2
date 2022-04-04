package com.borshevskiy.didagger2.example2.di

import android.content.Context
import com.borshevskiy.didagger2.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface AppComponentFactory {

        fun create(@BindsInstance context: Context, @BindsInstance timeMillis: Long): AppComponent
    }
}
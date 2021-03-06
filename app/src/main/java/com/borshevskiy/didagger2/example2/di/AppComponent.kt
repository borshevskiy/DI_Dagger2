package com.borshevskiy.didagger2.example2.di

import android.content.Context
import com.borshevskiy.didagger2.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@AppScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface AppComponentFactory {

        fun create(@BindsInstance context: Context, @BindsInstance timeMillis: Long): AppComponent
    }
}
package com.borshevskiy.didagger2.example2.di

import android.content.Context
import com.borshevskiy.didagger2.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface AppComponentBuilder {

        @BindsInstance
        fun context(context: Context): AppComponentBuilder

        @BindsInstance
        fun time(timeMillis: Long):  AppComponentBuilder

        fun build(): AppComponent
    }
}
package com.borshevskiy.didagger2.example2.di

import androidx.lifecycle.ViewModel
import com.borshevskiy.didagger2.example2.presentation.ExampleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface ViewModelModule {

    @IntoMap
    @StringKey("ExampleViewModel")
    @Binds
    fun bindExampleViewModel(impl: ExampleViewModel): ViewModel
}
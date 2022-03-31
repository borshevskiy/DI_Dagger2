package com.borshevskiy.didagger2.example2.di

import com.borshevskiy.didagger2.example2.data.repository.ExampleRepositoryImpl
import com.borshevskiy.didagger2.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindExampleRepository(exampleRepositoryImpl: ExampleRepositoryImpl): ExampleRepository
}
package com.borshevskiy.didagger2.example2.di

import com.borshevskiy.didagger2.example2.data.datasource.ExampleLocalDataSource
import com.borshevskiy.didagger2.example2.data.datasource.ExampleLocalDataSourceImpl
import com.borshevskiy.didagger2.example2.data.datasource.ExampleRemoteDataSource
import com.borshevskiy.didagger2.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @AppScope
    @Binds
    fun bindExampleRemoteDataSource(exampleRemoteDataSourceImpl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @AppScope
    @Binds
    fun bindExampleLocalDataSource(exampleLocalDataSourceImpl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

}
package com.borshevskiy.didagger2.example2.di

import com.borshevskiy.didagger2.example2.data.datasource.ExampleLocalDataSource
import com.borshevskiy.didagger2.example2.data.datasource.ExampleLocalDataSourceImpl
import com.borshevskiy.didagger2.example2.data.datasource.ExampleRemoteDataSource
import com.borshevskiy.didagger2.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @CustomScope
    @Binds
    fun bindExampleRemoteDataSource(exampleRemoteDataSourceImpl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @CustomScope
    @Binds
    fun bindExampleLocalDataSource(exampleLocalDataSourceImpl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

}
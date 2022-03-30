package com.borshevskiy.didagger2.example2.data

import com.borshevskiy.didagger2.example2.domain.ExampleRepository


class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {

    }
}

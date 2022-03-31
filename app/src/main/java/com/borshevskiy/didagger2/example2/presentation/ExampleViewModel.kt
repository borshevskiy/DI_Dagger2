package com.borshevskiy.didagger2.example2.presentation

import com.borshevskiy.didagger2.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}

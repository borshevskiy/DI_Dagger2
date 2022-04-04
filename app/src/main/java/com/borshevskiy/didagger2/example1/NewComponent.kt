package com.borshevskiy.didagger2.example1

import dagger.Component

@Component(modules = [Module::class])
interface NewComponent {

    fun inject(activity: Activity)
}
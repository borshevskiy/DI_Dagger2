package com.borshevskiy.didagger2.example1

class Activity {
    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component.inject(this)
    }
}


package com.borshevskiy.didagger2.example1

import javax.inject.Inject

class Activity {

    private val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
    private val mouse: Mouse = DaggerNewComponent.create().getMouse()
    private val monitor: Monitor = DaggerNewComponent.create().getMonitor()

    @Inject
    lateinit var _keyboard: Keyboard
    @Inject
    lateinit var _mouse: Mouse
    @Inject
    lateinit var _monitor: Monitor

    init {
        DaggerNewComponent.create().inject(this)
    }
}


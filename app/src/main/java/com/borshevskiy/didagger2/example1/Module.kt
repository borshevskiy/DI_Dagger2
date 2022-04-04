package com.borshevskiy.didagger2.example1

import dagger.Module
import dagger.Provides

@Module
class Module {

    @Provides
    fun provideMonitor(): Monitor = Monitor()

    @Provides
    fun provideKeyboard(): Keyboard = Keyboard()

    @Provides
    fun provideMouse(): Mouse = Mouse()

    @Provides
    fun provideStorage(): Storage = Storage()

    @Provides
    fun provideMemory(): Memory = Memory()

    @Provides
    fun provideProcessor(): Processor = Processor()

    @Provides
    fun provideComputerTower(
        storage: Storage,
        processor: Processor,
        memory: Memory
    ): ComputerTower = ComputerTower(storage, memory, processor)

    @Provides
    fun provideComputer(
        monitor: Monitor,
        mouse: Mouse,
        computerTower: ComputerTower,
        keyboard: Keyboard
    ): Computer = Computer(monitor, computerTower, keyboard, mouse)

}
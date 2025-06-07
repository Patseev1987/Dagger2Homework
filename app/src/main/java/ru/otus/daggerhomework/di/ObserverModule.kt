package ru.otus.daggerhomework.di

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow

@Module

class ObserverModule {
    @Provides
    @MainActivityScope
    fun provideScope() = CoroutineScope(Dispatchers.Main.immediate + SupervisorJob())

    @Provides
    @MainActivityScope
    fun provideFlow() = MutableStateFlow(0)
}
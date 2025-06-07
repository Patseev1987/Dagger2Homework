package ru.otus.daggerhomework.di

import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

@MainActivityScope
class ObserverModule {
    @Provides
    fun provideObserver() = CoroutineScope(Dispatchers.Main.immediate + SupervisorJob())
}
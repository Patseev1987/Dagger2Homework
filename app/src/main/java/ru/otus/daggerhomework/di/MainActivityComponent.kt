package ru.otus.daggerhomework.di

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Provides
import dagger.Subcomponent
import ru.otus.daggerhomework.MainActivity
import javax.inject.Named

@MainActivityScope
@Subcomponent(modules = [ObserverModule::class])
interface MainActivityComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(@Named("Activity") @BindsInstance context: Context): MainActivityComponent
    }

    fun receiverComponent(): ReceiverFragmentComponent.Factory

    fun producerComponent(): ProducerFragmentComponent.Factory

}
package ru.otus.daggerhomework.di

import android.app.Application
import dagger.BindsInstance
import dagger.Provides
import dagger.Subcomponent
import ru.otus.daggerhomework.MainActivity

@MainActivityScope
@Subcomponent(modules = [ObserverModule::class])
interface MainActivityComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance context: MainActivity): MainActivityComponent
    }

    fun inject(activity: MainActivity)

}
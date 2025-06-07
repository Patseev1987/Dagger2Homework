package ru.otus.daggerhomework.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.otus.daggerhomework.App
import javax.inject.Named

@Component(modules = [ColorGeneratorModule::class])
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(@Named("App") @BindsInstance applicationContext: Context): ApplicationComponent
    }

    fun mainActivityComponent(): MainActivityComponent.Factory

    fun inject(app: App)
}
package ru.otus.daggerhomework

import android.app.Application
import ru.otus.daggerhomework.di.ApplicationComponent
import ru.otus.daggerhomework.di.DaggerApplicationComponent

class App : Application() {
    val applicationComponent: ApplicationComponent = DaggerApplicationComponent.factory().create(this)

    override fun onCreate() {
        super.onCreate()
        applicationComponent.inject(this)
    }
}

val Application.component: ApplicationComponent get() = (this as App).applicationComponent
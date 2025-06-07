package ru.otus.daggerhomework.di

import dagger.Binds
import ru.otus.daggerhomework.ColorGenerator
import ru.otus.daggerhomework.ColorGeneratorImpl

class ColorGeneratorModule {

    @Binds
    fun bindColorGenerator(): ColorGenerator {
        return ColorGeneratorImpl()
    }
}
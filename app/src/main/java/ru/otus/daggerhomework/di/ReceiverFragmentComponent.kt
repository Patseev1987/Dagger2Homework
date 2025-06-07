package ru.otus.daggerhomework.di

import dagger.Subcomponent
import ru.otus.daggerhomework.ReceiverFragment

@Subcomponent
@ReceiverFragmentScope
interface ReceiverFragmentComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ReceiverFragmentComponent
    }

    fun inject(fragment: ReceiverFragment)
}
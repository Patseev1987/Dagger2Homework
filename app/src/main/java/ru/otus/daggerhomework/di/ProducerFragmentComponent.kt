package ru.otus.daggerhomework.di

import dagger.Subcomponent
import ru.otus.daggerhomework.ProducerFragment

@Subcomponent
@ProducerFragmentScope
interface ProducerFragmentComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ProducerFragmentComponent
    }

    fun inject(producerFragment: ProducerFragment)
}
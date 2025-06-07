package ru.otus.daggerhomework

import android.app.FragmentContainer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentContainerView
import ru.otus.daggerhomework.di.MainActivityComponent

class MainActivity : FragmentActivity() {
    lateinit var mainActivityComponent: MainActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivityComponent = application.component.mainActivityComponent().create(this)
    }
}
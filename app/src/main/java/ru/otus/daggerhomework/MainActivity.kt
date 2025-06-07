package ru.otus.daggerhomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import ru.otus.daggerhomework.di.MainActivityComponent

class MainActivity : ComponentActivity() {
    lateinit var mainActivityComponent: MainActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivityComponent = application.component.mainActivityComponent().create(this)

    }
}
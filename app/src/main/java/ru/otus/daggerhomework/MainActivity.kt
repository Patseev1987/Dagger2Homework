package ru.otus.daggerhomework

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private val component = (application as App).applicationComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
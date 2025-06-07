package ru.otus.daggerhomework

import android.app.Activity
import android.content.Context
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

class ProducerViewModel @Inject constructor(
    private val colorGenerator: ColorGenerator,
    @Named("Activity") private val context: Context,
    private val flow: MutableStateFlow<Int>
) {


    fun generateColor() {
        if (context !is Activity) throw RuntimeException("Activity context is required")
        Toast.makeText(context, "Color sent", Toast.LENGTH_LONG).show()
        flow.value = colorGenerator.generateColor()
    }
}
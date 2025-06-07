package ru.otus.daggerhomework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import ru.otus.daggerhomework.di.MainActivityComponent
import ru.otus.daggerhomework.di.ReceiverFragmentComponent
import javax.inject.Inject

class ReceiverFragment : Fragment() {

    private lateinit var frame: View

    @Inject
    lateinit var viewModel: ReceiverViewModel

    lateinit var receiverFragmentComponent: ReceiverFragmentComponent

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_receiver, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        frame = view.findViewById(R.id.frame)
        receiverFragmentComponent = (requireActivity() as MainActivity).mainActivityComponent.receiverComponent().create()

        receiverFragmentComponent.inject(this)
        CoroutineScope(Dispatchers.Main).launch {
            viewModel.state.collect { state ->
                populateColor(state)
            }
        }
    }

    fun populateColor(@ColorInt color: Int) {
        frame.setBackgroundColor(color)
    }
}
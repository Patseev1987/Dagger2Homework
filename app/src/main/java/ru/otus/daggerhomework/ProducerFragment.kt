package ru.otus.daggerhomework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import ru.otus.daggerhomework.di.MainActivityComponent
import ru.otus.daggerhomework.di.ProducerFragmentComponent
import javax.inject.Inject

class ProducerFragment : Fragment() {

    @Inject
    lateinit var viewModel: ProducerViewModel

    lateinit var producerComponent: ProducerFragmentComponent

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_producer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            producerComponent = (requireActivity() as MainActivity).mainActivityComponent.producerComponent().create()
            producerComponent.inject(this)
        view.findViewById<Button>(R.id.button).setOnClickListener {
            //отправить результат через flow в другой фрагмент
            viewModel.generateColor()
        }
    }
}
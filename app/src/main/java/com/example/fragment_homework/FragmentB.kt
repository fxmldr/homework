package com.example.fragment_homework

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b.view.*

class FragmentB : Fragment() {

    var precision: Int = 0

    private  lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        precision = arguments?.getInt("ab")!!

        view.Precision.text = precision.toString()
        communicator = activity as Communicator
        val pi = pi(precision)

        view.buttonBC.setOnClickListener{
            communicator.passDataBC(pi)
        }

        return view
    }

}
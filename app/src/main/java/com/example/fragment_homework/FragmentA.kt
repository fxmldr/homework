package com.example.fragment_homework

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_a.view.*


class FragmentA : Fragment() {

    private  lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        communicator = activity as Communicator

        view.buttonAB.setOnClickListener{
            var precision = view.editTextPrecision.text.toString()

            if (precision != "") {

                communicator.passDataAB(precision.toInt())

            } else {

                Toast.makeText(activity, "Need a number" as String?,
                        Toast.LENGTH_LONG).show()

            }

        }

        return view
    }


}
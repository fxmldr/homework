package com.example.fragment_homework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_c.view.*


class FragmentC : Fragment() {

    var pi: Double? = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_c, container, false)

        val result = arguments?.getStringArrayList("bc")

        val recyclerView = view.findViewById(R.id.recyclerView) as RecyclerView
        val adapter = result?.let { Adapter(it) }

        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

        view.buttonReturn.setOnClickListener{

            reloadActivity()

        }

        return view

    }

    private fun getAnswer(pi: String, size: Int = 100): MutableList<TestData> {

        val result = mutableListOf<TestData>()

        for (index in 1..size) {
            val text = "Pi #$pi"
            val icon = R.drawable.pi_symbol
            result.add(TestData(text, icon))
        }

        return result
    }

    private fun reloadActivity() {
        activity?.finish();
        startActivity(activity?.intent);
    }

}
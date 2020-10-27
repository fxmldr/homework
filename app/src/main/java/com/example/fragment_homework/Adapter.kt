package com.example.fragment_homework

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    private val values: MutableList<TestData>

) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun getItemCount(): Int = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        Log.d("Adapter", "onCreateViewHolder")
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setTestData(values[position])
        Log.d("Adapter", "onBindViewHolder in position: $position")
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val contentTextView: TextView = itemView.findViewById(R.id.contentTextView)
        private val iconImageView:  ImageView = itemView.findViewById(R.id.iconImageView)

        fun setTestData(testData: TestData) {
            contentTextView.text = testData.text
            iconImageView.setImageResource(testData.icon)
            Log.d("OnBindClickListener", "onBind")
        }
    }
}

data class TestData(
    val text: String,

    @DrawableRes
    val icon: Int
)
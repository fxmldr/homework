package com.example.fragment_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "LOGW"
const val MSG_AB = "ab"
const val MSG_BC = "bc"

class MainActivity : AppCompatActivity(), Communicator{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA = FragmentA()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragmentA)
            commit()
        }
    }

    override fun passDataAB(precision: Int) {
        val bundle = Bundle()
        bundle.putInt(MSG_AB,precision)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentB = FragmentB()
        fragmentB.arguments = bundle

        transaction.replace(R.id.fragment_container, fragmentB)
        transaction.commit()
    }

    override fun passDataBC(result: Double) {
        val bundle = Bundle()
        bundle.putDouble(MSG_BC,result)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentC = FragmentC()
        fragmentC.arguments = bundle

        transaction.replace(R.id.fragment_container, fragmentC)
        transaction.commit()
    }

}
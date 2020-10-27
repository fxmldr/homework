package com.example.fragment_homework

import androidx.fragment.app.Fragment

interface Communicator {
    fun passDataAB(precision: Int)
    fun passDataBC(result: Double)
}
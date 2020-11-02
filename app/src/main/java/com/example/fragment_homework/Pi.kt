package com.example.fragment_homework

import kotlin.math.*

fun Double.round(decimals: Int): Double {
    var multiplier = 1.0
    repeat(decimals) { multiplier *= 10 }
    return round(this * multiplier) / multiplier
}

fun pi(precision: Int) : ArrayList<String> {
    var pi = 0.0
    var result = ArrayList<String>()
    var a = 1.0
    var b = 1/sqrt(2.0)
    var t = 0.25
    result.add(precision.toString())
    for (i in 0..3) {
        val an = (a+b)/2.0
        b = sqrt(a * b)
        t -= 2.0.pow(i) * (a - an).pow(2)
        a = an
        result.add(an.toString())
        result.add(b.toString())
        result.add(t.toString())
        result.add(a.toString())
    }
    if (precision != 0) {
        pi = (((a + b).pow(2)) / (4 * t)).round(precision)
        result.add(pi.toString())
        return result
    }
    else {
        pi = 3.0
        result.add(pi.toString())
        return result
    }
}
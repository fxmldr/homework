package com.example.fragment_homework

import kotlin.math.*

fun Double.round(decimals: Int): Double {
    var multiplier = 1.0
    repeat(decimals) { multiplier *= 10 }
    return round(this * multiplier) / multiplier
}

fun pi(precision: Int) : Double {
    var a = 1.0
    var b = 1/sqrt(2.0)
    var t = 0.25
    for (i in 0..3) {
        val an = (a+b)/2.0
        b = sqrt(a * b)
        t -= 2.0.pow(i) * (a - an).pow(2)
        a = an
    }
    if (precision != 0)
        return (((a+b).pow(2))/(4*t)).round(precision)
    else
        return 3.0
}
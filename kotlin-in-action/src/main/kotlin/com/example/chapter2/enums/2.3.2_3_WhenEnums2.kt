package com.example.chapter2.enums

import com.example.chapter2.enums.Color1.*


fun getWarmth(color: Color1) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(ORANGE))
}

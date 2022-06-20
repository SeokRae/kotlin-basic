package com.example.chapter2.enums

enum class Colors4 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getWarmth(color: Colors4) = when(color) {
    Colors4.RED, Colors4.ORANGE, Colors4.YELLOW -> "warm"
    Colors4.GREEN -> "neutral"
    Colors4.BLUE, Colors4.INDIGO, Colors4.VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(Colors4.ORANGE))
}

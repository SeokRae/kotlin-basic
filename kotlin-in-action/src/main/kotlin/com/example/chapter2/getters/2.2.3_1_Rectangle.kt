package com.example.chapter2.getters

import java.util.*

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main() {
    println("createRandomRectangle() = ${createRandomRectangle().isSquare}")
    println("Rectangle().isSquare = ${Rectangle(5, 5).isSquare}")
}
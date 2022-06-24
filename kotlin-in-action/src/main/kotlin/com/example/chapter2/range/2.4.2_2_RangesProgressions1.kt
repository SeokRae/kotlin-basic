package com.example.chapter2.range

fun main(args: Array<String>) {
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
}

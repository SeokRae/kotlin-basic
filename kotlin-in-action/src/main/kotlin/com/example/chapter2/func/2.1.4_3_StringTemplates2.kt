package com.example.chapter2.func

fun main(args: Array<String>) {
    // 중괄호 내에 식(expression)을 사용할 수도 있음
    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}!")
}
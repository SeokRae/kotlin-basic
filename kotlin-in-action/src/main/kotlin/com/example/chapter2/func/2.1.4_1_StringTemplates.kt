package com.example.chapter2.func

fun main(args: Array<String>) {
    // 식이 본문인 함수
//    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    val name : String = if (args.isNotEmpty()) args[0] else "Kotlin"
    // 자바의 문자열 접합 연산 "" + "" 과 동일하지만 더 간결
    println("Hello, $name!")
}
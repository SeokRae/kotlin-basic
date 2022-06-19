package com.example.chapter2.func

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        // 중괄호로 변수를 감사 가독성을 높임
        println("Hello, ${args[0]}!")
    }
}
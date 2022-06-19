package com.example.chapter1

data class Person(
    val name: String,
    val age: Int? = null
)

fun main(args: Array<String>) {
    val persons = listOf(
        Person("Alice"),
        Person("Bob", age = 29)
    )

    // 코틀린 1.0에서 사용되던 방식
//    val oldest = persons.maxBy { it.age ?: 0 }
    // 코틀린 1.4, 1.5, 1.6에서 사용하는 방식
    val oldest = persons.maxByOrNull { it.age ?: 0 }

    println("The oldest is: $oldest")
}

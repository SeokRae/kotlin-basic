package com.example.chapter2.enums

enum class Colors3 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Colors3) =
    // 함수의 반환 값으로 when 식을 직접 사용
    when (color) {
        // 색이 특정 enum 상수와 같을 때, 그 상수에 대응하는 문자열을 돌려준다.
        Colors3.RED -> "Richard"
        Colors3.ORANGE -> "Of"
        Colors3.YELLOW -> "York"
        Colors3.GREEN -> "Gave"
        Colors3.BLUE -> "Battle"
        Colors3.INDIGO -> "In"
        Colors3.VIOLET -> "Vain"
    }

fun main(args: Array<String>) {
    println(getMnemonic(Colors3.BLUE))
}

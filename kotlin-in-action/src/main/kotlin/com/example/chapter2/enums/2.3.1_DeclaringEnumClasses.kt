package com.example.chapter2.enums

enum class Colors2(
    // 상수의 프로퍼티 정의
    val r: Int, val g: Int, val b: Int
) {
    // 각 상수를 생성 시 그에 대한 프로퍼티 값을 지정
    RED(255, 0, 0)
    , ORANGE(255, 165, 0)
    , YELLOW(255, 255, 0)
    , GREEN(0, 255, 0)
    , BLUE(0, 0, 255)
    , INDIGO(75, 0, 130)
    // 코틀린은 ; 세미콜론을 사용하지 않아도 되지만 enum에서는 사용
    , VIOLET(238, 130, 238);

    // enum 클래스 안에서 메서드를 정의
    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Colors2.BLUE.rgb())
}

package com.example.chapter2.enums

import com.example.chapter2.enums.Color1.*

// 인자가 없는 when -> 불필요한 객체 생성을 막을 수 있다.
fun mixOptimized(c1: Color1, c2: Color1) =
    // when에 아무 인자도 없으려면 각 분기의 조건이 불리언 결과를 계산하는 식이어야 한다.
    when {
        (c1 == RED && c2 == YELLOW) ||
        (c1 == YELLOW && c2 == RED) ->
            ORANGE

        (c1 == YELLOW && c2 == BLUE) ||
        (c1 == BLUE && c2 == YELLOW) ->
            GREEN

        (c1 == BLUE && c2 == VIOLET) ||
        (c1 == VIOLET && c2 == BLUE) ->
            INDIGO

        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println(mixOptimized(BLUE, YELLOW))
}

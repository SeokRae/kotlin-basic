package com.example.chapter2.enums

import com.example.chapter2.enums.Color1.*


fun mix(c1: Color1, c2: Color1) =
    // 조건 분기에 상수만을 사용할 수 있는 자바와 달리 코틀린은 임의의 객체를 허용한다.
    when (setOf(c1, c2)) {
        // when 식의 인자로 아무 객체나 사용할 수 있다.
        // when 은 이렇게 인자로 받은 객체가 각 분기 조건에 있는 개체와 같은지 테스트
        setOf(RED, YELLOW) -> ORANGE // 두 색을 혼합하여 다른 색을 만들 수 있다는 로직을 구현 가능
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        // 매치 되는 분기 조건이 없으면 문장 실행
        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
}

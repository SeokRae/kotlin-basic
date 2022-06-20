package com.example.chapter2.enums

// 짧은 이름으로 사용하기 위해 enum 상수를 모두 임포트
import com.example.chapter2.enums.Color1.*


fun getWarmth(color: Color1) = when(color) {
    // 임포트한 enum 상수를 이름만으로 사용
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(ORANGE))
}

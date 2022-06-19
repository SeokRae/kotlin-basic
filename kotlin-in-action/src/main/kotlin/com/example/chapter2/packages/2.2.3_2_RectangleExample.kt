package com.example.chapter2.packages

import com.example.chapter2.getters.createRandomRectangle

// 다른 패키지의 클래스 정보를 임포트 하는 예제
fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}

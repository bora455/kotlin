package chap09

import java.util.Arrays //Arrays를 사용하기 위해

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    println("arr: ${Arrays.toString(arr)}") //배열의 내용을 문자열로 변환함
    println("size: ${arr.size}") //배열의 크기
    println("sum(): ${arr.sum()}") //배열의 합
    
    //게터에 의한 접근과 대괄호 연산자 표기법
    println(arr.get(2))
    println(arr[2])
    
    //세터에 의한 값의 설정
    arr.set(2, 7)
    arr[0] = 8
    println("size: ${arr.size}, arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")
    
    //루프를 통한 배열 요소의 접근
    for (i in 0..arr.size -1) { //0부터 arr.size -1까지
        println("arr[$i] = ${arr[i]}")
    }
}
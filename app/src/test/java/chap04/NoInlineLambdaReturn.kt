package `chap04`

fun main() {
    retFunc2()
}

fun inlineLambda2(a: Int, b: Int, out:(Int, Int)->Unit) {//inline 제거
    out(a, b)
}

fun retFunc2() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{a, b-> //람다식 블록의 시작 부분에 라벨을 지정
        val result = a+b
        if(result>10) return@lit //라벨을 사용한 블록의 끝부분으로 반환
        println("result: $result")
    }
    println("end of retFunc") //이 부분이 실행됨
}

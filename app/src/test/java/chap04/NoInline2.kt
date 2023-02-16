package `chap04`

fun main() {
    retFunc4()
}

fun inlineLambda4(a: Int, b: Int, out:(Int, Int)->Unit) {//inline 제거
    out(a, b)
}

fun retFunc4() {
    println("start of retFunc")
    inlineLambda(13, 3, fun(a, b){
        val result = a+b
        if(result>10) return //10보다 크면 이 함수를 빠져나감
        println("result: $result") //10보다 크면 이 문장에 도달하지 못함
    })
    println("end of retFunc")
}

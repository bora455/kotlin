package chap03

fun main() {
    var data  = 10
    val result = if (data > 0) {
        println("data > 0")
        true // 참일 때 반환값
    } else {
        println("data <= 0")
        false // 거짓일 때 반환값
    }
    println(result)
}
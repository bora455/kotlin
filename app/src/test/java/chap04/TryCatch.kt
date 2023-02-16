package chap04

fun main() {
    val a = 6
    val b = 0
    val c:Int
    
    try {
        c = a/b //0으로 나눔
    } catch (e: Exception) { //ArithmeticException
        println("Exception is handled") //e.printStackTrace
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}
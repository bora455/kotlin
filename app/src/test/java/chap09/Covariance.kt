package chap09

class Box2<out T>(val size: Int)

fun main(args: Array<String>) {
    val anys: Box2<Any> = Box2<Int>(10)
    //val nothings: Box<Nothing> = Box<Int>(20) //자료형 불일치
    println(anys.size)
}

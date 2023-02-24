package chap09

class Box3<in T>(val size: Int)

fun main(args: Array<String>) {
    //val anys: Box<Any> = Box<Int>(10) //자료형 불일치로 오류!
    val nothings: Box3<Nothing> = Box3<Int>(20) //관계 성립으로 객체 생성 가능
    println(nothings.size)
}
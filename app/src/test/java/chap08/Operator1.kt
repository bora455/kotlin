package chap08

data class Point2(val x: Int, val y: Int)

operator fun Point2.unaryMinus() = Point2(-x, -y)

fun main() {
    val point2 = Point2(10, 20)
    println(-point2)
}

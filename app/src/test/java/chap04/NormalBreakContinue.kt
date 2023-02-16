package chap04

fun main() {
    for(i in 1..5) {
        if (i==3) continue//break
        print(i)
    }
    println()
    println("outside")
}
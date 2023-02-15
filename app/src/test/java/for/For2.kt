package `for`

fun main() {
    var sum1: Int = 0
    var sum2: Int = 0

    for (i in 1..10 step 2) { //홀수누적
        sum1 += i
    }
    print(sum1) //25
    print ("\n")

    for (i in 2..10 step 2) { //짝수누적
        sum2 += i
    }
    print(sum2) //30
}
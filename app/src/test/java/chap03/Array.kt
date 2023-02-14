package chap03

fun print3Numberd(num1: Int, num2: Int, num3: Int) {
    //num1, 2, 3을 각각 출력
}

fun print4Numberd(num1: Int, num2: Int, num3: Int, num4: Int) {
    //num1, 2, 3, 4을 각각 출력
}

fun main(args:Array<String>) {
    normalVarargs(1,2, 3, 4)
    normalVarargs(4, 5, 6)
}

fun normalVarargs(vararg counts: Int) {
    for (num in counts) {
        println("$num")
    }
    print("\n")
}




package chap05

class Person2(firstName: String,
out: Unit = println("[Primaty Constructor] Parameter")) {
    val fName = println("[Property] Person2 fName: $firstName")

    init {
        println("[init] Person2 init block")
    }

    constructor(firstName: String, age: Int,
    out: Unit = println("[Secondary Constructor] Parameter")): this(firstName){
        println("[Secondary Constructor] Body: $firstName, $age")
    }
}

fun main() {
    val p1 = Person2("kildong", 30)
    println()
    val p2 = Person2("Dooly")
}
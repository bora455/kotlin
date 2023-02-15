package `when`

fun main() {
    print("Enter the money: ")
    var money = readLine()!!.toDouble()
    var grade: String = "부장"

    when {
        money >= 600.0 -> grade = "부장"
        money in 500.0..599.9 -> grade = "차장"
        money in 400.0..499.9 -> grade = "과장"
        money in 300.0..399.9 -> grade = "대리"
        money <299.9 -> grade = "사원"
    }
    println("Money: $money, Grade: $grade")
}
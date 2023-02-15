package `when`

fun main() {
    print("Enter the score")
    var score = readLine()!!.toDouble()
    var grade: Char = 'F'

    //인수 없는 When의 사용
    when {
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> 'B'
        score in 70.0..79.9 -> 'C'
        score <80.0 -> grade = 'F'
    }
    println("Score: $score, Grade: $grade")
}
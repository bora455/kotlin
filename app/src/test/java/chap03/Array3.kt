package chap03

val data1 = intArrayOf(10, 20, 30)
val data2 = booleanArrayOf(true, true, true)

fun main() {
    val data1 = arrayOf<Int>(10, 20, 30)
    println(
        """
            array size : ${data1.size} // 3
            array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)} // 10, 20, 30
        """.trimIndent()
    )
}
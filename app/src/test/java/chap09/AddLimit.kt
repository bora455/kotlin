package chap09

fun <T: Number> addLimit(a: T, b: T, op: (T, T)->T): T {
    return op(a, b)
}
fun main() {
    //val result = addLimit("abc", "def", { a, b -> a + b })
    //제한된 자료형으로 오류 발생
    val result = addLimit(10, 20, { a, b -> a + b })
}
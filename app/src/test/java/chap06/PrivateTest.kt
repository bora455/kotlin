package chap06

private class PrivateClass {
    private var i =1
    private fun privateFunc() {
        i += 1 //접근 허용
    }
    fun access() {
        privateFunc() //접근 허용
    }
}
class OtherClass {
    val opc = PrivateClass() //불가-프로퍼티 opc는 private가 되야 함
    fun test() {
        val pc = PrivateClass() //생성 가능
    }
}
fun main() {
    val pc = PrivateClass() //생성 가능
    pc.i
    pc.privateFunc()
}
fun TopFunction() {
    val tpc = PrivateClass() //객체 생성 가능
}
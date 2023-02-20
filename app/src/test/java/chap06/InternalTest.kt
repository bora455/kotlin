package chap06

internal class InternalClass {
    internal  var i = 1
    internal fun icFunc() {
        i += 1
        println(i)
    }
    fun access() {
        icFunc()
    }
}
class Other {
    internal val ic = InternalClass()
    fun test() {
        println(ic.i)
        println(ic.icFunc())
    }
}
fun main() {
    val mic = InternalClass()
    mic.i
    mic.icFunc()
    val other = Other()
    other.test()
}
//2
//1
//2
//kotlin.Unit
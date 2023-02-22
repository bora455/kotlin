package chap07

interface Pet {
    val category: String
    val msgTags: String //val 선언시 게터의 구현 가능
    get() = "I'm yor lovery pet!"

    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}
class Cat(override var category: String): Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}
fun main() {
    val obj = Cat("small")
    println("Pet Message Tags: ${obj.msgTags}")
    obj.feeding() //구현된 메서드
    obj.patting() //기본 메서드
}
package chap07

interface Pet2 {
    val category: String
    val msgTags: String //val 선언시 게터의 구현 가능
        get() = "I'm yor lovery pet!"

    fun feeding()
    fun patting() {
        println("Keep patting!")
    }
}
open class Animal(val name: String)
class Dog(name: String, override var category: String): Animal(name), Pet{
    override fun feeding() {
        println("Feed the dog a bone")
    }
}
class Cat7(name: String, override var category: String): Animal(name), Pet{
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}
class Master {
    fun playWithPet(dog: Dog) {
        println("Enjoy with my ${dog.name}.")
    }
    fun playWithPet(cat: Cat7) {
        println("Enjoy with my ${cat.name}.")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Todo", "Small")
    val cat = Cat7("Coco","BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}
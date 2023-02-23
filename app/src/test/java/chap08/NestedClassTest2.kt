package chap08

class Outer2 {
    class Nested {
        fun accessOuter() {
            println(country)
            getSomething()
        }
    }
    companion object {
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
}
fun main() {
    Outer2.Nested().accessOuter()
}
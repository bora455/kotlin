package chap07

abstract class Printer {
    abstract fun print()
}
val myPrinter = object: Printer() {
        override fun print() {
            print("출력합니다.")
        }}
fun main() {
    myPrinter.print()
}
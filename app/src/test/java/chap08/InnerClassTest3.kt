package chap08

interface Switcher {
    fun on(): String
}
class Smartphone3(val model: String) {
    fun powerOn(): String {
        class Led(val color: String) {
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher {
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }
}
fun main() {
    val output = Smartphone3("x7")
    val sol = output.powerOn()
    println(sol)
}
package chap08

class Smartphone2(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}GB"
        //바깥 클래스의 프로퍼티 접근
    }
    fun powerOn(): String {
        class Led(val color: String) {
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        return powerStatus.blink()
    }
}
fun main() {
    val mySdcard = Smartphone2("s7").ExternalStorage(32)
    println(mySdcard.getInfo())

    val myphone = Smartphone2("Note9")
    myphone.ExternalStorage(128)
    println(myphone.powerOn())
}
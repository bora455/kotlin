package chap07

abstract class Vehicle(val name: String, val color: String, val weight: Double){
    abstract var maxSpeed: Double
    var year = "2018"
    abstract fun start()
    abstract fun stop()
    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, " +
                "Max speed: $maxSpeed")
    }
}
class Car(name: String, color: String, weight: Double, override var maxSpeed: Double)
    : Vehicle(name, color, weight) {
        override fun start() { //코드의 구현
            println("Car Started")
        }
        override fun stop() { //코드의 구현
            println("Car Stapped")
        }
    }
class Motorcycle(name: String, color: String, weight: Double, override var maxSpeed: Double)
    : Vehicle(name, color, weight) {
    override fun start() { //코드의 구현
        println("Bike Started")
    }
    override fun stop() { //코드의 구현
        println("Bike Stapped")
    } }
fun main() {
    val car = Car("SuperMatize", "yellow", 1110.0, 270.0)
    val motor = Motorcycle("DreanBike", "red", 173.0, 100.0)

    car.year = "2023"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()
}
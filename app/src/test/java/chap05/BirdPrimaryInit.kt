package chap05

//주 생성자 선언
class Bird6(var name: String, var wing: Int, var beak: String, var color: String){
    //초기화 블록
    init {
        println("----------초기화 블록 시작----------")
        println("이름음 $name, 부리는 $beak")
        println("----------초기화 블록 끝----------")
    }

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird6("Yourbird", 2, "long", "red")
    println("coco.name: ${coco.name}, coco.wing: ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak: ${coco.beak}")
}
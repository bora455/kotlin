package chap03

fun main() {
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(
        """
            map size : ${map.size} // 2
            map data : ${map.get("one")}, ${map.get("two")} // hello, world
        """.trimIndent()
    )
}
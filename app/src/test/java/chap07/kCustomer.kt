package chap07

class kCustomer {
    companion object {
        const val LEVEL = "INNTERMEDIATE"
        @JvmStatic fun login() = println("Login...") //애노테이션 표기 사용
        fun miso() = println("miso...")
    }
}
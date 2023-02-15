package chap03

fun  main() {
    var x=1
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // 블록 구문 사용 가능
            print("x는 1, 2가 아닙니다.")
        }
    }
    print ("\n")

    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("기타")
    }
}


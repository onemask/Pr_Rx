/*

 *//*


class Line_1 {
    fun solution(inputString: String): Int {
        val pattern = listOf("()", "{}", "[]", "<>")
        var answer = 0
        pattern.forEach { p ->
            if (inputString.contains(p[0])) {
                val start = inputString.filter { it == p[0] }.count()
                val last = inputString.filter { it == p[1] }.count()
                val startIdx = inputString.indexOfFirst { it == p[0] }
                val endIDx = inputString.indexOfFirst { it == p[1] }
                if (startIdx < endIDx) {
                    if (start == last) {
                        if (answer > 0) {
                            answer += start
                        } else {
                            answer = start
                        }
                        print("answer $answer")
                        return@forEach
                    } else {
                        answer = -1
                    }
                } else
                    answer = -1
            }
        }
        return answer
    }
}

fun main() {
    val input = ">_<"
    println("answer ${Line_1().solution(input)}")
}*/

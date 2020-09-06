package Challenge/*
class Dev_Mobile3() {
    fun solution(command: String, buttons: Array<String>, scores: IntArray): Int {
        var answer = 0
        var nonalpha = arrayOf("^", "v", "<", ">")
        var alpha = arrayOf("A", "B", "C", "X", "Y", "Z")
        val skils = mutableListOf<Pair<String, Int>>().apply {
            plus(Pair("v>AB^CYv^XA", 50))
            plus(Pair("<v>A", 18))
            plus(Pair("^XAZ", 20))
            plus(Pair("Yv^XA", 30))
            plus(Pair(">AB^", 25))
        }


        return answer
    }
}


fun Programers.LeetCode.Challenge.main() {
    val input = arrayOf(
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 2, 1, 1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 2, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 1, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    )
    Challenge.Dev_Mobile().solution(input)
}

*/

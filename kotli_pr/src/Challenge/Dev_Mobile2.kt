package challenge

class Dev_Mobile2 {
    companion object {
        // 상, 하, 좌, 우 "U","R","L","D"
        val dx = intArrayOf(0, 0, -1, 1)
        val dy = intArrayOf(1, -1, 0, 0)
        var map = Array(500) { Array(500) { 0 } }
        var checked = false
        var visit = Array(500) { Array(500) { false } }
    }

    fun solution(moves: Array<String>): Int {
        var answer = 0
        val direction = mutableListOf<Pair<String, IntArray>>().apply {
            add(Pair("U", intArrayOf(1, 0)))
            add(Pair("R", intArrayOf(0, 1)))
            add(Pair("L", intArrayOf(-1, 0)))
            add(Pair("D", intArrayOf(0, -1)))
        }

        moves.forEachIndexed { index, s ->
            val next = direction.find { it.first == s }?.second
            if (next!![0] in 0..Int.MAX_VALUE && next[1] in 0..Int.MAX_VALUE) {
                visit[next[0]][next[1]] = true
                map[next[0]][next[1]] = 1
            }
        }

        map.forEachIndexed { i, ints ->
            ints.forEachIndexed { j, i ->
                print(" ${map[i][j]}")
            }
            println()
        }

        return answer
    }

}

fun main() {
    val input = arrayOf("U", "R", "D", "L", "U", "R", "D", "L")
    Dev_Mobile2().solution(input)
}


/*
private fun check(x: Int, y: Int, d: Int): Boolean {
    for (i in 0..4) {
        if (!ok(x + dx[d] * i, y + dy[d] * i))
            return false
        if (map[x][y] != map[x + dx[d] * i][y + dy[d] * i])
            return false

    }
    if (ok(x + dx[d] * 5, y + dy[d] * 5) && map[x][y] == map[x + dx[d] * 5][y + dy[d] * 5]) {
        return false
    }
    if (ok(x + dx[d] * -1, y + dy[d] * -1) && map[x][y] == map[x + dx[d] * -1][y + dy[d] * -1]) {
        return false
    }
    return true
}
}
*/
/*

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


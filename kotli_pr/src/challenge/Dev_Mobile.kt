package challenge

class Dev_Mobile {
    companion object {
        // 우,하,우하,좌
        val dx = intArrayOf(1, 0, 1, -1)
        val dy = intArrayOf(0, 1, 1, 1)
        var map = Array(15) { Array(15) { 0 } }
        var checked = false
        var visit = Array(15) { Array(15) { BooleanArray(4) } }
    }

    private fun go(x: Int, y: Int, step: Int, dir: Int) {
        var goCheck = false
        if (x + dx[dir] in 0..14 && y + dy[dir] in 0..14) {
            if (map[x][y] == map[x + dx[dir]][y + dy[dir]] && !visit[x + dx[dir]][y + dy[dir]][dir]) {
                visit[x + dx[dir]][y + dy[dir]][dir] = true
                goCheck = true
                go(x + dx[dir], y + dy[dir], step + 1, dir)
            }
        }
        if (!goCheck && step == 5) {
            checked = true
            return
        }
    }

    fun solution(board: Array<IntArray>): Int {
        // 1: 검은돌  // 2: 흰돌  // 0: 알x
        var answer = 0
        //input
        board.forEachIndexed { yidx, y ->
            y.forEachIndexed { xidx, x ->
                map[yidx][xidx] = board[yidx][xidx]
            }
        }
        Loop@
        for (j in 0..14)
            for (i in 0..14) {
                if (map[i][j] in 1..2) {
                    for (k in 0..3) {
                        if (!visit[i][j][k]) {
                            visit[i][j][k] = true
                            go(i, j, 1, k)
                            if (checked) {
                                answer = map[i][j]
                                println("map ${map[i][j]}")
                                break@Loop
                            }
                        }
                    }
                }
            }
        return answer
    }

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

fun main() {
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
    Dev_Mobile().solution(input)
}


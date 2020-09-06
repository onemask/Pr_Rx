package leetCode

import kotlin.math.min

class LeetCode_Squre() {
    fun countSquares(matrix: Array<IntArray>): Int {
        val counts = IntArray(matrix[0].size)
        var topLeft = 0
        var result = 0

        for (yy in matrix.indices) {
            for (xx in matrix[0].indices) {
                if (matrix[yy][xx] == 1) {
                    val top = if (yy == 0) 0 else counts[xx]
                    val left = if (xx == 0) 0 else counts[xx - 1]
                    counts[xx] = 1 + min(min(top, left), topLeft)
                    result += counts[xx]
                    topLeft = if (xx == matrix[0].size - 1) 0 else top
                } else
                    counts[xx] = 0
            }
        }
        return result
    }
}

fun countBits(num: Int): IntArray {
    val answer = mutableListOf(0)
    if (num == 0)
        return answer.toIntArray()
    else {
        for (n in 1..num) {
            answer.add(n.countOneBits())
        }
    }
    print("answer ${answer.toString()}")
    return answer.toIntArray()
}


fun main() {
    val matrix = arrayOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))
    println("answer ${LeetCode_Squre().countSquares(matrix)}")
    countBits(2)
}
/*
    Input:
    [
      [1,1,1],
      [1,0,1],
      [1,1,1]
    ]
    Output:
    [
      [1,0,1],
      [0,0,0],
      [1,0,1]
    ]
 *//*


class Solution73 {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val zeroPosition = mutableListOf<Pair<Int, Int>>()

        matrix.forEachIndexed { idx_y, yv ->
            yv.forEachIndexed { idx_x, xv ->
                if (xv == 0) {
                    zeroPosition.add(idx_y to idx_x)
                }
            }
        }

        zeroPosition.forEach {
            makeZero(it.first, null, matrix).apply {
                makeZero(null, it.second, this)?.apply {
                    println("Output:")
                    this.forEach {
                        println()
                        it.forEach {
                            print("$it")
                        }
                    }
                }
            }
        }
    }

    fun makeZero(idx_y: Int? = null, idx_x: Int? = null, matrix: Array<IntArray>): Array<IntArray> {

        val y = mutableListOf<Int>()
        var myMatrix = matrix

        repeat(matrix[0].count()) {
            y.add(0)
        }


        idx_y?.let {
            myMatrix[idx_y] = y.toIntArray()
        }

        idx_x?.let {
            matrix.forEachIndexed { iy, vy ->
                vy.forEachIndexed { ix, xv ->
                    if (it == ix) {
                        myMatrix[iy][ix] = 0
                    }
                }
            }
        }

        return myMatrix
    }
}

fun main() {
    //[
    //  [1,1,1],
    //  [1,0,1],
    //  [1,1,1]
    //]
    val input1 = arrayOf(intArrayOf(1,1,1), intArrayOf(1,0,1), intArrayOf(1,1,1))
    val input2 = arrayOf(intArrayOf(0,1,2,0), intArrayOf(3,4,5,2), intArrayOf(1,3,1,5))
    println("solution ${Solution73().setZeroes(input1)}")
}*/

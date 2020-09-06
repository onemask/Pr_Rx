package LeetCode

/**
 * // Challenge.This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * class BinaryMatrix {
 *     fun get(x:Int, y:Int):Int {}
 *     fun dimensions():List<Int> {}
 * }
 */

/*class BinaryMatrix {
    var double = arrayListOf<List<Int>>()
    fun get(x: Int, y: Int): Int = double[x][y]
    fun dimensions(y: Int): List<Int> = double[y]
}*/

/*class Solution_g {
    fun leftMostColumnWithOne(binaryMatrix: BinaryMatrix): Int {
        val answerList = mutableListOf<Int>()
        for (y in 0 until binaryMatrix.double.size) {
            if (binaryMatrix.dimensions(y).contains(1)) {
                val idx = binaryMatrix.dimensions(y).indexOfFirst { it == 1 }
                answerList.add(idx)
            }
        }
        return answerList.min() ?: -1
    }

    fun leftMostColumnWithOne1(binaryMatrix: BinaryMatrix): Int {
        val y = binaryMatrix.dimensions()[0]
        val x = binaryMatrix.dimensions()[1]
        var answer = x
        for (idx_y in 0..y) {
            for (idx_x in 0..x) {
                if (binaryMatrix.get(idx_y, idx_x) == 1) {
                    answer = min(x, idx_x)
                    if (answer == 0) return answer
                    break
                }
            }
        }
        return if (answer == x) -1 else answer
    }

}*/

data class User(
    val name: String,
    var age: Int
)



fun main() {
    val Job = User("Steve Jobs", 52)
    val JobsToday = Job.copy(age = 63)
    println("Job $Job")
    println("JobsToday ${JobsToday}") //name
}


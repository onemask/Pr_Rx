package programers

class SkillTest02 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = ArrayList<IntArray>()
        arr1.forEachIndexed { y, ints ->
            var array = IntArray(ints.size)
            ints.forEachIndexed { x, i ->
                array[x] = (i + arr2[y][x])
            }
            answer.add(array)
        }
        return answer.toTypedArray()
    }

    fun solution2(s: String): String {
        var answer = ""
        var small = ""
        var upper = ""
        s.forEach {
            if (it.isUpperCase())
                upper += it
            else
                small += it
        }

        val smalls = small.map {
            it
        }.sortedDescending()

        val uppers = upper.map {
            it
        }.sortedDescending()

        smalls.forEach {
            answer += it
        }
        uppers.forEach {
            answer += it
        }
        return answer
    }
}

fun main() {
    /*  val input = arrayOf(intArrayOf(1), intArrayOf(2))
      val input2 = arrayOf(intArrayOf(3), intArrayOf(4))
      SkillTest02().solution(input, input2)*/

    val input3 = "Zbcdefg"
    SkillTest02().solution2(input3)

}
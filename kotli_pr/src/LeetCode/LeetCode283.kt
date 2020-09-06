package leetCode/*
import kotlin.math.ln

class LeetCode283() {
    fun moveZeroes(nums: IntArray) {
        var answer = mutableListOf<Int>()
        var zeroCount = 0
        for (i in nums) {
            if (i == 0) {
                zeroCount++
            } else {
                answer.add(i)
            }
        }

        nums[0] = nums[1]
        repeat(zeroCount) {
            answer.add(0)
        }

        nums.forEach {
            print(" new nums $it")
        }
        print("[")
        answer.forEachIndexed { index, i ->
            if (index != nums.lastIndex) {
                print("$i,")
            } else
                print("$i")
        }
        print("]")
    }

    fun moveZeroes2(nums: IntArray): Unit {

        //   0, 1, 0, 3, 12
        // 1,0,0,3,12
        // 1,0,0,3,12
        //1,0,3,0,12
        //1,0,3,12,0

        val zeroCount = nums.filter { it == 0 }.count()
        var last = 0

        repeat(zeroCount) {
            for (i in 0..nums.lastIndex - last)
            //nums.forEachIndexed { index, i ->
                if (nums[i] == 0) {
                    if (i != nums.lastIndex) {
                        nums[i] = nums[i + 1]
                        nums[i + 1] = i
                    }
                }
            last++
        }
    }

}


fun Programers.LeetCode.Challenge.main() {
    val input = intArrayOf(0, 1, 0, 3, 12)
    print("answer ${LeetCode283().moveZeroes2(input)}")
}
*/

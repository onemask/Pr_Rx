class LeetCode_Counting {
    fun countBits(num: Int): IntArray {
        val answer = IntArray(num + 1)
        if (num == 0)
            return answer
        else {
            for (n in 1..num) {
                answer[n] = answer[n shr  1] + (n and  1)
                // n.countOneBits()
            }
        }
        return answer
    }
}


fun main() {
    LeetCode_Counting().countBits(3)
}
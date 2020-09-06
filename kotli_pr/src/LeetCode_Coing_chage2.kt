
import java.util.*


class LeetCode_Coing_chage2() {
    fun change(amount: Int, coins: IntArray): Int {
        val dp = IntArray(amount + 1).apply { this[0] = 1 }
        for (coin in coins)
            for (currAmt in 1..amount)
                if (currAmt >= coin)
                    dp[currAmt] += dp[currAmt - coin]
        return dp[amount]
    }
    private fun solution(target: Int, arr: IntArray): Int {
        Arrays.sort(arr)
        var left = 0
        var right = arr.size - 1
        var mid = 0
        while (left < right) {
            mid = (left + right) / 2
            if (target == arr[mid]) {
                println("Find Target : " + target + ", Value : " + arr[mid])
                return arr[mid]
            }
            if (target < arr[mid]) right = mid - 1 else left = mid + 1
        }
        return -1
    }
}

fun main() {
    val amount = 5
    val coins = intArrayOf(1, 2, 5)
    LeetCode_Coing_chage2().change(amount, coins)
}
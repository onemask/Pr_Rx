package challenge

class Solution {
    fun solution(
        snapshots: Array<Array<String>>,
        transactions: Array<Array<String>>
    ): Array<Array<String>> {
        var answer = arrayOf<Array<String>>()
        val real_trans = transactions.map { it[0] }.distinct()
        print("real_trans $real_trans")
        return answer
    }


}

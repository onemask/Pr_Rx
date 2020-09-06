package Challenge/*
class Line_2 {
    fun solution(answer_sheet: String, sheets: Array<String>): Int {
        var answer = -1
        return answer
    }

    */
/*
    "111011110011111011111100011111"
    3
    18

    "001100"
    "5"
    6
     *//*

    fun solution3(road: String, n: Int): Int {
        var answer = -1
        var nn = n
        val zeroCount = road.filter { it == '0' }.count()
        val zeroIndx = mutableListOf<Int>()

        //find zero Index
        road.forEachIndexed { index, c ->
            if (c == '0') {
                zeroIndx.add(index)
            }
        }
        if (zeroCount < n) {
            answer = road.length
        } else {
            var temp = road.toCharArray()


            for (i in zeroIndx) {
                temp[i] = '1'
                nn--
                do {
                    val first_zero = temp.indexOfFirst { it == '0' }
                    val last_zero = temp.indexOfLast { it == '0' }
                    answer = Math.max(answer, last_zero - first_zero)
                } while (nn > 0)


            }
            print("answer $answer")
            return answer
        }

    }

*/
/* fun DP(n: Int, idx: Int, road: String): Int {
 }*//*



    fun Programers.LeetCode.Challenge.main() {
        val road = "111011110011111011111100011111"

        print("answer is ${Line_2().solution3(road, 3)}")
    }

xx*/

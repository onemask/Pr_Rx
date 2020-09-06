class This2 {
    fun solution(answers: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        var count = mutableListOf(0, 0, 0)
        val num1 = intArrayOf(1, 2, 3, 4, 5)
        val num2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val num3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        if (num1.size >= answers.size) {
            for (i in answers.indices) {
                if (answers[i] == num1[i])
                    count[0] = count[0].plus(1)
            }
        }
        if (num2.size >= answers.size) {
            for (i in answers.indices) {
                if (answers[i] == num2[i])
                    count[1] = count[1].plus(1)
            }
        }
        if (num3.size >= answers.size) {
            for (i in answers.indices) {
                if (answers[i] == num3[i])
                    count[2] = count[2].plus(2)
            }
        }

        val tt = count.mapIndexed { index, i -> i to index }
        println("tt $tt")

        tt.sortedBy { it.first }.forEach {
            if (it.first != 0)
                answer.add(it.second)
        }

        /*
        -- 코드를 입력하세요
        SELECT BRANCH_ID,sum(SALARY) AS TOTAL
        from EMPLOYEES
        GROUP BY BRANCH_ID
        ORDER BY BRANCH_ID
         */


        println(answers.toString())
        println("plus $count answer $answer")


        return answer.toIntArray()
    }
}

fun main() {
    val answers = intArrayOf(2, 1, 2, 3, 2)
    This2().solution(answers)
}
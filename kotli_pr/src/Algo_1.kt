/*
import java.lang.StringBuilder

class Algo_1 {
    fun solution(args: Array<String>) {

    }
}

*/
/*
8 4
5
4
2
3
5
7
8
9
 *//*

fun main() {
    val input = arrayOf(5, 2)
    val countNum = 2
    var answer = 0
    val groups = listOf(5, 4, 2, 3, 5, 7, 8, 9)
    val groups2 = listOf(4, 3, 5, 2, 8)
    //      4
    //3
    //5
    //2
    //8

    groups2.forEach {
        if (it / countNum >= 1) {
            if (it % countNum in 1 until countNum-1) {
                val sum = (it / countNum) + 1
                answer += sum
            } else {
                if (it % countNum == 0) {
                    answer += it / countNum
                }
                answer++
            }
        }
    }
    println("answer $answer")

}*/

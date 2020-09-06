package Programers

import java.util.*


class Programers_BestAlbum {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        return genres.indices.groupBy { genres[it] }
            .toList()
            .sortedByDescending { it.second.sumBy { plays[it] } }
            .map { it.second.sortedByDescending { plays[it] }.take(2) }
            .flatten()
            .toIntArray()
    }

    fun solution2(array: IntArray, commands: Array<IntArray>): IntArray {
        val realAnswer = mutableListOf<Int>()
        commands.forEach {
            val slice = array.slice((it[0] - 1) until it[1]).sorted()
            realAnswer.add(slice[it[2] - 1])
            println("answer${slice[it[2] - 1]} ")
        }
        return realAnswer.toIntArray()
    }

    fun solution3(numbers: IntArray): String {
        var answer = ""
        numbers.sortedWith(Comparator { num1: Int, num2: Int -> "$num2$num1".compareTo("$num1$num2") })
            .forEach { answer += it }
        if ("(0*)".toRegex().replace(answer, "").isEmpty()) {
            answer = "0"
        }
        return answer
    }

    fun solution4(numbers: String): Int {
        var answer = 0
        val list = mutableListOf<Int>()
        numbers.forEach {
            list.add(it.toString().toInt())
        }
        dfs(list)
        println("riht $list")
        return answer
    }

    fun dfs(list: List<Int>) {
        val answer = mutableListOf<Int>()
        list.forEach {
            if (answer.find { it == it } == null)
                answer.add(it)
        }
    }
}

fun main() {

    //4
    val number = "17"
    Programers_BestAlbum().solution4(number)


    /* val inputGenres = arrayOf("classic", "pop", "classic", "classic", "pop", "dance")
     val inputPlays = intArrayOf(500, 600, 150, 800, 2500, 9000)
     println("${Programers.Programers_BestAlbum().solution(inputGenres, inputPlays)}")
    */
    //2
    /*val inputArray = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    val inputCommands = arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
    println("${Programers.Programers_BestAlbum().solution2(inputArray, inputCommands)}")
    */

    //3
    /* val temp = intArrayOf(3, 30, 34, 5, 9)
     Programers.Programers_BestAlbum().solution3(temp)*/
}
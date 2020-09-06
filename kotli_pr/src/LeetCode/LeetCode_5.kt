package LeetCode

import java.text.DecimalFormat
import java.util.*
import java.util.regex.Pattern

class LeetCode_5 {
    fun simpleArraySum(ar: Array<Int>): Int {
        var answer = 0
        if (ar.isNotEmpty()) {
            ar.forEach {
                answer += it
            }
        }
        return answer
    }

    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
        val dashBoard = arrayOf(0, 0)
        a.forEachIndexed { index, i ->
            if (a[index] > b[index])
                dashBoard[0]++
            else if (a[index] < b[index])
                dashBoard[1]++
        }
        return dashBoard
    }

    // Complete the aVeryBigSum function below.
    fun aVeryBigSum(ar: Array<Long>): Long {
        var answer: Long = 0
        ar.forEach {
            answer += it
        }
        return answer
    }

    // Complete the plusMinus function below.
    fun plusMinus(arr: Array<Int>): Unit {
        val positive_count = arr.filter { it > 0 }.count().toDouble()
        val negative_count = arr.filter { it < 0 }.count().toDouble()
        val zero_count = arr.filter { it == 0 }.count().toDouble()
        val size = arr.count()
        val form = DecimalFormat("0.000000")
        println(form.format(positive_count / size))
        println(form.format(negative_count / size))
        println(form.format(zero_count / size))
    }

    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        val size = arr.size
        var first_diagonal = IntArray(size)
        val second_diagonal = IntArray(size)
        for (idx in 0 until size) {
            first_diagonal[idx] = arr[idx][idx]
        }

        for (idx in 0 until size) {
            second_diagonal[idx] = arr[idx][size - 1 - idx]
        }
        return Math.abs(first_diagonal.sum() - second_diagonal.sum())
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mNums = nums.mapIndexed { index, i -> index to i }
        var answer = mutableListOf<Int>()
        if (target == 0 && nums.contains(0)) {
            nums.forEachIndexed { index, i ->
                if (i == target) answer.add(index)
            }
        } else {
            mNums.forEachIndexed { idx, value ->
                val maybe = target - value.second
                val first = mNums.subList(idx + 1, mNums.size).find { it.second == maybe }
                if (first != null) {
                    answer.add(value.first)
                    answer.add(first.first)
                }
            }
        }
        println("answer $answer")
        return answer.toIntArray()
    }

    fun braces(values: Array<String>): Array<String> {
        val answer = mutableListOf<String>()
        values.forEach {
            answer.add(checkBrace2(s = it))
        }
        println("answer $answer")
        return answer.toTypedArray()
    }

    fun checkBrace2(s: String): String {
        val stack = Stack<Char>()
        val one = ('(' to ')')
        val two = ('{' to '}')
        val three = ('[' to ']')

        for (i in s.length - 1 downTo 0) {
            when (s[i]) {
                one.second, two.second, three.second -> {
                    stack.push(s[i])
                }
                one.first, two.first, three.first -> {
                    if (s[i] == one.first) {
                        if (stack.search(one.second) == -1) {
                            return "NO"
                        } else
                            stack.pop()
                    }
                    if (s[i] == two.first) {
                        if (stack.search(two.second) == -1) {
                            return "NO"
                        } else
                            stack.pop()
                    }
                    if (s[i] == three.first) {
                        if (stack.search(three.second) == -1) {
                            return "NO"
                        } else
                            stack.pop()
                    }
                }
            }
        }
        return if (stack.size == 0)
            "YES"
        else
            "NO"
    }

    fun programmerStrings(s: String): Int {
        val p = "programmer"
        val second = "grammproear"
        val third = "xprozmerqgram"
        var answer = 0

        val fi = Pattern.compile(p).matcher(s).regionStart()
        val s = Pattern.compile(p).matcher(s).regionEnd()

        println("answer $fi $s")
        return fi
    }


    fun maxInversions(arr: Array<Int>): Long {
        val answer = arrayListOf<IntArray>()
        var temp = IntArray(3)
        for (i in 0..arr.size - 1) {
            temp[0] = (arr[i])
            for (j in i + 1..arr.size - 1) {
                if (temp[0] > arr[j])
                    temp[1] = (arr[j])
                for (k in j + 1..arr.size - 1) {
                    if (temp[1] > arr[k]) {
                        temp[2] = (arr[k])
                        if (!answer.contains(temp))
                            answer.add(temp.clone())
                    }
                }
            }
            temp = intArrayOf(0, 0, 0)
        }
        return answer.count().toLong()
    }
}

fun main() {
    val input = "progxrammerrxproxgrammer"
    println(LeetCode_5().programmerStrings(input))
}
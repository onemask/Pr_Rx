/*
Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation:
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"
 *//*


class LeetCode_Perform_Shift {
    fun stringShift(s: String, shift: Array<IntArray>): String {
        var answer = s
        shift.forEach {
            when (it[0]) {
                //left
                0 -> {
                    val left = answer.take(it[1])
                    val right = answer.takeLast(s.length - it[1])
                    answer = right.plus(left)
                }
                //right
                1 -> {
                    val right = answer.takeLast(it[1])
                    val left = answer.take(s.length - it[1])
                    answer = right.plus(left)
                }

            }
        }
        return answer
    }


    private fun sort(arr: IntArray) {
        for (i in arr.indices) { // 1
            var standard = i
            for (j in i + 1 until arr.size) { // 2
                if (arr[j] < arr[standard]) standard = j // 3
            }
            // 4
            val temp = arr[standard]
            arr[standard] = arr[i]
            arr[i] = temp
            print(arr)
        }
    }
}

//선택정렬
fun selectionSort(nums: IntArray) {
    var min = 0
    for (i in nums.indices) {
        min = i
        for (j in i + 1 until nums.size) {
            if (nums[j] < nums[min])
                min = j
        }
        val temp = nums[min]
        nums[min] = nums[i]
        nums[i] = temp
        println("${i}번째")
        nums.forEach {
            print(" $it")
        }
    }
}

fun bubbleSort(nums: IntArray) {
    for (i in nums.indices) {
        for (j in 0 until nums.size - i - 1 step 1)
            if (nums[j + 1] < nums[j]) {
                val temp = nums[j]
                nums[j] = nums[j + 1]
                nums[j + 1] = temp
            }
    }
    nums.forEach {
        print("$it ")
    }
}

fun mergeSort(list: List<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }
    val middle = list.size / 2
    var left = list.subList(0, middle);
    var right = list.subList(middle, list.size);
    return merge(mergeSort(left), mergeSort(right))
}

fun merge(left: List<Int>, right: List<Int>): List<Int> {
    var indexLeft = 0
    var indexRight = 0
    val newList: MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }

    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }

    return newList;
}

private fun sort(arr: IntArray) {
    for (i in arr.indices) { // 1
        var standard = i
        for (j in i + 1 until arr.size) { // 2
            if (arr[j] < arr[standard]) standard = j // 3
        }
        // 4
        val temp = arr[standard]
        arr[standard] = arr[i]
        arr[i] = temp
    }

    for (a in arr) {
        println("a $a")
    }
}

fun main() {
    */
/* val input = "abcdefg"
     var array = arrayOf(intArrayOf(1,1), intArrayOf(1,1),intArrayOf(0,2),intArrayOf(1,3))
     print("solu ${LeetCode_Perform_Shift().stringShift(input,array)}")
    *//*

    */
/* val inputArray = intArrayOf(1, 6, 2, 4, 3, 9, 7)
     println("sort ${mergeSort(input2.toMutableList())}")
 *//*

    */
/*  val hamburgeer = "hamburger"
      println("${inverse(hamburgeer)}")

      val list = LinkedList<Int>()
      val input = listOf(1, 2, 3, 4, 5)
      list.addAll(input)

      print("revers ${list.reverse().toString()}")
      list.reverse()
      *//*

    //print("fibonacci ${fibonacci_2(10)})")

    val input2 = intArrayOf(254, 3, 213, 64, 75, 56, 4, 324, 65, 78, 9, 5, 76, 3410, 8, 342, 76)
    val input = listOf(5, 4, 3, 2, 1)

    //print("answer ${Insertsort(input)}")
    //print("quick ${quicksort(input)}")

    print("anagran ${anagram("apple", "pplea")}")
}

fun gcd(a: Int, b: Int): Int {
    if (a % b == 0)
        return b
    return gcd(b, a % b)
}

*/
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 *//*

class ListNode1(var `val`: Int) {
    var next: ListNode1? = null
}


fun reverseList(head: ListNode1?): ListNode1? {
    if (head == null) return null
    var current = head
    var prev: ListNode1? = null
    var next: ListNode1? = null

    while (current != null) {
        next = current.next
        current.next = prev
        prev = current
        current = next
    }
    return prev
}


fun anagram(str1: String, str2: String): Boolean {
    return str1.toCharArray().sort().equals(str2.toCharArray().sort())

}

fun fibonacci(n: Int): Int {
    if (n == 1) return 1
    if (n == 0) return 0
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun fibonacci_2(n: Int): Int {
    if (n < 0) return 0
    val list = mutableListOf<Int>()
    list.add(0)
    list.add(1)
    for (v in 2 until 10) {
        print("n $v")
        list.add(list[v - 1] + list[v - 2])
    }
    return list[n]
}

fun isRandom(): Boolean {
    val list = mutableListOf<Int>()
    var answe = false

    while (list.size < 10) {
        list.add((Math.random() * 10 + 1).toInt())
    }

    for (i in 0 until list.size) {
        for (j in i + 1 until list.size) {
            if (list[i] == list[j])
                answe = true
        }
        if (answe)
            break
    }
    print("list $list")
    return answe
}

//삽입정렬
fun Insertsort(arr: IntArray) {
    for (i in 1 until arr.size) { // 1
        val standard = arr[i]
        var index = i - 1
        while (0 <= index && standard < arr[index]) { //2
            arr[index + 1] = arr[index]
            index--
            arr.forEach {
                print(" $it")
            }
            println()
        }
        arr[index + 1] = standard // 3
    }
}

fun quicksort(items: List<Int>): List<Int> {
    if (items.count() < 2) {
        return items
    }
    val pivot = items[items.count() / 2]

    val equal = items.filter { it == pivot }
    println("pivot value is : " + equal)

    val less = items.filter { it < pivot }
    println("Lesser values than pivot : " + less)

    val greater = items.filter { it > pivot }
    println("Greater values than pivot : " + greater)

    return quicksort(less) + equal + quicksort(greater)
}


fun inverse(input: String): String {
    val answer = mutableListOf<Char>()
    for (i in input.length - 1 downTo 1) {
        print("${input[i]}")
    }
    return answer.toString()
}


fun selectionSort2(nums: IntArray) {
    var mins = 0
    for (i in 0..nums.size - 1) {
        mins = i
        for (j in i..nums.size - 1 step 1) {
            if (nums[j] < nums[mins])
                mins = j
        }
        val temp = nums[mins]
        nums[mins] = nums[i]
        nums[i] = temp
    }

    nums.forEach {
        print("$it")
    }
}

fun bubblesort2(nums: IntArray) {
    for (i in nums.indices) {
        for (j in 0 until nums.size - 1 - i step 1) {
            if (nums[j + 1] < nums[j]) {
                val temp = nums[j]
                nums[j] = nums[j + 1]
                nums[j + 1] = temp
            }
        }
    }
    nums.forEach {
        print(" $it")
    }
}*/

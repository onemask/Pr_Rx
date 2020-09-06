package programers/*
class Programers {
    fun solution1(input: Array<String>, participation: Array<String>): String {
        var answer = ""
        input.forEach {
            if (participation.contains(it).not())
                answer = it
        }
        return answer
    }

    fun solution2(phone_book: Array<String>): Boolean {
        var answer = true
        val phoneBookList = mutableListOf<String>()

        //make_phot_book
        phone_book.first().forEachIndexed { index, c ->
            if (index == 0)
                phoneBookList.add(c.toString())
            else
                phoneBookList.add(phoneBookList.last().plus(c.toString()))
        }

        for (idx in 1..phone_book.lastIndex) {
            val check = answer
            for (takeIdx in phone_book.first().length downTo 1) {
                if (phoneBookList.contains(phone_book[idx].take(takeIdx))) {
                    answer = false
                    break
                } else
                    answer = true
            }
            if (check != answer)
                break
        }


        print("$phoneBookList")
        return answer
    }
}

fun Programers.LeetCode.Challenge.main() {
    val input = arrayOf("leo", "kiki", "eden")
    val input2 = arrayOf("marina", "josipa", "nikola", "vinko", "filipa")
    val output = arrayOf("eden", "kiki")
    val output2 = arrayOf("josipa", "filipa", "marina", "nikola")
    //print("${Programers().solution1(input2,output2)}")

    val solution2_input = arrayOf("12", "123", "1235", "567", "88")
    print("pp ${Programers().solution2(solution2_input)}")
}*/

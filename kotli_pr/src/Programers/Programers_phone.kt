package Programers
class Programers_phone {
    fun solution(phone_book: Array<String>): Boolean {

        var answer = true
        for (firstIdx in phone_book.indices) {
            for (secondIdx in 1 until phone_book.size) {
                answer = !phone_book[secondIdx].contains(phone_book[firstIdx])
                println("ddd $answer")
            }
            if (answer.not())
                break
        }




        println("answer $answer")
        return answer
    }
}

fun main() {
    val inputs = arrayOf("123", "456", "789")
    Programers_phone().solution(inputs)
}
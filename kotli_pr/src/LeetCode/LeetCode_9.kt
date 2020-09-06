package leetCode

fun countBits2(num: Int): IntArray {
    val answer = mutableListOf(0)
    if (num == 0)
        return answer.toIntArray()
    else {
        for (n in 1..num) {
            answer.add(n.countOneBits())
        }
    }
    print("answer ${answer.toString()}")
    print("answer ${KotlinVersion}")

    return answer.toIntArray()
}
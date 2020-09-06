class Programers_clothes {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 0
        val map = HashMap<String, Int>()

        clothes.forEach {
            map.put(it[1], map.getOrDefault(it[1], 0) + 1)
        }

        map.forEach {
            answer.plus(it.value)
        }
        println("map ${map.entries}")

        map.values.forEach {
            answer += (it + 1)
        }

        return answer-1
    }
}

fun main() {
    val inputs = arrayOf(
        arrayOf("yellow_hat", "headgear"),
        arrayOf("blue_sunglasses", "eyewear"),
        arrayOf("green_turban", "headgear")
    )

    Programers_clothes().solution(inputs)
}
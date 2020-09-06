package leetCode

import java.util.*


class LeetCode_ReconstructLitinternay {
    fun findItinerary(tickets: List<List<String>>) {
        val graphs = tickets.map {
            Grpah(it[0], it[1])
        }
        val answer = mutableListOf<String>()

        val first = graphs.find {
            it.first == "JFK"
        }!!.second

        answer.add("JFK")
        answer.add(first)
        return
    }
}

data class Grpah(
    val first: String,
    val second: String
)

fun findItinerary(tickets: Array<Array<String>>): List<String>? {
    val ret = LinkedList<String>()
    val map: MutableMap<String, PriorityQueue<String>> =
        HashMap()
    val stack = Stack<String>()
    for (t in tickets) {
        if (!map.containsKey(t[0])) map[t[0]] = PriorityQueue()
        map[t[0]]!!.offer(t[1])
    }
    stack.push("JFK")
    while (!stack.isEmpty()) {
        val next = stack.peek()
        if (map.containsKey(next) && map[next]!!.size > 0) stack.push(
            map[next]!!.poll()
        ) else ret.addFirst(stack.pop())
    }

    return ret
}

fun main() {
    val input = listOf(
        listOf("MUC", "LHR"),
        listOf("JFK", "MUC"),
        listOf("SFO", "SJC"),
        listOf("LHR", "SFO")
    )
    print(LeetCode_ReconstructLitinternay().findItinerary(input))
}
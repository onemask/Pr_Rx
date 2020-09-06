package programers

class SkillTest01 {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val answer = ArrayList<Pair<String, Char>>()
        val pair = strings.map {
            it to it[n]
        }

        val hash = HashMap<Char, Int>()
        pair.forEach {
            hash.put(it.second, hash[it.second] ?: 0 + 1)
        }

        if (hash.values.all { it == 0 }) {
            pair.sortedBy { it.second }.forEach {
                answer.add(it.first to it.second)
            }
        } else {
            /*  pair.forEach {
                  if (answer.contains(it.))

              }*/
        }

        return answer.map { it.first }.toTypedArray()

    }
}

fun main() {
    val input = arrayOf("abce", "abcd", "cdx")
    SkillTest01().solution(input, 1)

}
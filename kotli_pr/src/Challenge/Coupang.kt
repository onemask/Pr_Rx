package challenge

class Coupang {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val answer =strs.groupBy { makeCharKeys(it) }
        return answer.values.toMutableList()
    }

    fun makeCharKeys(str : String) : String{
        val answer = str.toCharArray().sorted().toString()
        return answer
    }
}

fun main(){
    val input = arrayOf("eat","tea","tan","ate","nat","bat")
    println(Coupang().groupAnagrams(input))
}
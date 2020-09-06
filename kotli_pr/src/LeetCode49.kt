/*
import java.util.*

class LeetCode49() {
    //fun groupAnagrams(strs: Array<String>): List<List<String>> {

    fun groupAnagrams(strs: Array<String>) {
        var map = mutableMapOf<String, Int>()
        var maplist = mutableListOf<Pair<String,Int>>()

        var answer = mutableListOf<List<String>>()
        var idx = 0

        val table = Hashtable<String,Int>()

        strs.forEach { str ->
            str.forEach { chars ->
                idx += (chars.toInt())
            }
            map[str] = idx
            idx = 0
        }

        strs.forEach { str ->
            str.forEach { chars ->
                idx += (chars.toInt())
            }
            maplist.add(Pair(str,idx))
            idx = 0
        }

        strs.forEach { str ->
            str.forEach { chars ->
                idx += (chars.toInt())
            }
            table.put(str,idx)
            idx = 0
        }

        println(table.entries.groupBy { it.value}.values)

        val sasasa  =(table.entries.groupBy { it.value}.values)
        

         println(map.entries.groupBy {
              it.value
          }.map {
             it.value
         })

        println("maplist ${ maplist.groupBy {
            it.second
        }}")

        val newmap = maplist.groupBy {
            it.second
        }



        println(map.entries)

        val newMap = map.entries.groupBy { it.value }
    }


}

fun main() {
    val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    println(LeetCode49().groupAnagrams(input))
}

*/
/*
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */

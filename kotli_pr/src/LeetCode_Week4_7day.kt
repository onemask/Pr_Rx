/*
import java.util.*
import kotlin.collections.HashMap

class FirstUnique(nums: IntArray) {
    var q: HashMap<Int, Int>? = null

    init {
        q.
        nums.forEach { n ->
            q?.put(n ,0)
            q?.plus(n to 0)
            //q?.put(n, q?.get(n) ?: 0 + 1)
        }
    }

    fun showFirstUnique(): Int {
        return q?.filter { it.value == 1 }?.keys?.first()!!
    }

    fun add(value: Int) {
        q?.put(value, q?.get(value) ?: 0 + 1)
    }

}

fun main() {
    var obj = FirstUnique(intArrayOf(2,3,5))
    print("first ${obj.showFirstUnique()}")
}

*/
/**
 * Your FirstUnique object will be instantiated and called as such:
 * var obj = FirstUnique(nums)
 * var param_1 = obj.showFirstUnique()
 * obj.add(value)
 */

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun main() {
    var li = ListNode(5)

    var v = li.`val`
    print("v $v")

}

class Leet_TDL() {
    fun middleNode(head: ListNode?): ListNode? {
        val A = arrayOfNulls<ListNode>(100)
        var t = 0
        var head = head
        while (head!!.next != null) {
            A[t++] = head
            head = head.next
        }
        return A[t / 2]
    }
}


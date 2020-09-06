package leetCode

/**
 * Example:
 * var li = LeetCode.ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class LeetCode.ListNode(var `val`: Int) {
 *     var next: LeetCode.ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Leet_TDL {
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


/*
Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 *//*



*/
/*var ti = TreeNode(5)
var v = ti.`val`*//*


class TreeNode(var `val`: Int = 0) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null && t2 == null) return null
        val root = TreeNode((t1?.`val` ?: 0) + (t2?.`val` ?: 0))
        root.left = mergeTrees(t1?.left, t2?.left)
        root.right = mergeTrees(t1?.right, t2?.right)
        return root
    }
}

fun main(){
    var ti = TreeNode(5)
    var v = ti.`val`

    */
/*
    [1,3,2,5]
    [2,1,3,null,4,null,7]
     *//*


    val t1 = TreeNode([1,3,2,5])

    print("t1 ")
    println("mergerTrees ${Solution().mergeTrees()}")
}


class Solution3 {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val answerList = mutableListOf<Int>()
        for (answer in 1..nums.max()!!) {
            for (number in nums) {
                if (number != answer) {
                    answerList.add(answer)
                }
            }
        }
        return answerList
    }

    fun findDisappearedNumbers2(nums: IntArray): List<Int> {
        val answer = mutableListOf<Int>()

        if (nums.isEmpty()) {
            return nums.toList()
        } else if (nums.max() == 1) {
            return listOf(2)
        }

        for (value in 1..nums.size) {
            if (!nums.contains(value))
                answer.add(value)
        }
        return answer
    }
}

*/
/*
fun main() {
    print(Solution().findDisappearedNumbers2(intArrayOf(1,1,2,2)))
}*/



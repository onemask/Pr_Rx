package LeetCode///*
//*
// * Example:
// * var ti = TreeNode(5)
// * var v = ti.`val`
// * Definition for a binary tree node.
// * class TreeNode(var `val`: Int) {
// *     var left: TreeNode? = null
// *     var right: TreeNode? = null
// * }
//
//class TreeNode(var `val`: Int) {
//    var left: TreeNode? = null
//    var right: TreeNode? = null
//}
//
////1,2,3,4,5
//class LeetCode_453() {
//    fun diameterOfBinaryTree(root: TreeNode?): Int {
//        var answer = mutableListOf<Int>()
//        if (root?.left?.left == null) {
//            val left_leaf = root?.left
//            while (true) {
//                answer.add(left_leaf?.`val`!!)
//
//            }
//
//        }
//
//    }
//
//    fun diameterOfBinaryTree2(root: TreeNode?): Int {
//        if (root == null)
//            return 0
//        val dis = depth(root.left) + depth(root.right)
//        val left_dis = diameterOfBinaryTree2(root.left)
//        val right_dis = diameterOfBinaryTree2(root.right)
//        return Math.max(dis, Math.max(left_dis, right_dis))
//    }
//    fun depth(root: TreeNode?): Int {
//        if (root == null) return 0
//        val max = Math.max(depth(root.left), depth(root.right)) + 1
//        return max
//    }
//}
//)
//나중에 이거 한번 보기
//class Challenge.Solution {
//    fun diameterOfBinaryTree(root: TreeNode?): Int {
//        val max = Max(0)
//        depth(root, max)
//        return max.max
//    }
//
//    fun depth(root: TreeNode?, max: Max): Int {
//        if (root == null) return 0
//        val left = depth(root.left, max)
//        val right = depth(root.right, max)
//        if (left + right > max.max) {
//            max.max = left + right
//        }
//        return Math.max(left, right) + 1
//    }
//
//}
//*/

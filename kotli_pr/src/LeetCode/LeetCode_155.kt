package LeetCode/*
import java.util.*

class LeetCode_155() {

}

fun Programers.LeetCode.Challenge.main() {
    val obj = MinStack()
    obj.push(-2)
    obj.push(0)
    obj.push(-3)
    println("min ${obj.getMin()}")
    obj.pop()
    println("top ${obj.top()}")
    println("min ${obj.getMin()}")
}

class MinStack() {

    */
/** initialize your data structure here. *//*


    private var stack = Stack<Int>()
    private var list = mutableListOf<Int>()

    fun push(x: Int) {
        stack.add(x)
        list.add(x)
    }

    fun pop() {
        list.removeAt(list.lastIndexOf(stack.pop()))
       // stack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return list.min()!!
    }

}*/

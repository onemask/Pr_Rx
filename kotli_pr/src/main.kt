/*import java.util.*import kotlin.math.absimport kotlin.math.maximport kotlin.math.min*//*fun main() {    println("this")    val gridss : Array<IntArray> = arrayOf(intArrayOf(3,0,8,4),intArrayOf(2,4,5,7),intArrayOf(9,2,5,3),intArrayOf(0,3,1,0))    val answer = solution2().maxIncreaseKeepingSkyline2(gridss)    //print(answer)    print(solution2().some())}*//*//Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]class solution2 {    fun maxIncreaseKeepingSkyline2(grid: Array<IntArray>): Int {        val N = grid.size        val rowMaxes = IntArray(N)        val colMaxes = IntArray(N)        for (r in 0 until N)            for (c in 0 until N) {                rowMaxes[r] = max(rowMaxes[r], grid[r][c])                colMaxes[c] = max(colMaxes[c], grid[r][c])            }        var ans = 0        for (r in 0 until N)            for (c in 0 until N)                ans += min(rowMaxes[r], colMaxes[c]) - grid[r][c]        return ans    }    fun some() {        *//*       * foldRightIndexed & foldIndexed       *//*        data class Fruit(            val price: Int,            val name: String        )        val objectLlist =            listOf(                Fruit(100, "apple"),                Fruit(200, "pineapple"),                Fruit(500, "watermelon")            )        println("foldRightIndexed \n")        val fruitList = objectLlist.foldRightIndexed(0, { index, fruitPrice, next ->            println("\n index $index fruitPrice $fruitPrice next $next ")            fruitPrice.price + next        })        println("fruitList $fruitList")        println("foldIndex \n")        val fruitLeftList =            objectLlist.foldIndexed(objectLlist.first().name, { index, fruitName, total ->                println("\n index $index fruitName $fruitName total $total ")                fruitName + " " + total.name            })        println("fruitLeftList $fruitLeftList")    }}class Solution400() {    fun findNthDigit(n: Int): Int {        // return        return 0    }}*//*    goods	coupons	result    [[25400, 2], [10000, 1], [31600, 1]]	[[5, 3], [23, 2], [11, 2], [9, 5]]	75396    [[3100, 2], [7700, 1], [3100, 2]]	[[33, 4]]	14490 *//*class SolutionCu {    fun solution3(goods: Array<IntArray>, coupons: Array<IntArray>): Long {        var answer = 0L        val goodslist = goods.map { it[0] to it[1] }.sortedByDescending { it.first }        val coupons = coupons.map { it[0] to it[1] }.sortedByDescending { it.first }        for (i in goodslist.indices){            var totalCoupons = goodslist[i].second            while (totalCoupons!=0){                val percent =(1-(coupons[i].first.toFloat()/100f))                answer += goodslist[i].first * percent.toLong()                totalCoupons--            }        }        return answer.toLong()    }}fun main() {    //println("name ${Solution400().findNthDigit(3)}")    val array: Array<IntArray> = arrayOf(intArrayOf(25400, 2), intArrayOf(10000, 1), intArrayOf(31600, 1))    val coupns = arrayOf(intArrayOf(5, 3), intArrayOf(23, 2), intArrayOf(11, 2), intArrayOf(9, 5))    println("cupang ${SolutionCu().solution3(array, coupns)}")}*/
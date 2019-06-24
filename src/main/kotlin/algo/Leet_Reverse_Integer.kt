package algo

class Leet_Reverse_Integer {

}

fun main(){
    val solution = Solution()
    print(solution.reverse5(-321))


}
class Solution {
    fun reverse(x: Long): Int {
        if (x < Int.MIN_VALUE && x > Int.MAX_VALUE - 1)
            return 0
        else {
            return if (x > 0) {
                x.toString().reversed().toInt().also {
                    return if (it > Int.MAX_VALUE)
                        0
                    else
                        it
                }
            } else
                (x * -1).toString().reversed().toInt() * -1

        }
    }

    //the Best solution
    fun reverse3(x: Int): Int {
        var num = x
        var ans = 0

        while(num!= 0){
            if(isOverflow(ans)) return 0
            ans=ans*10+num%10
            num/=10
        }

        return ans
    }

    private inline fun isOverflow(input:Int) = input != input*10/10

    //the Next solution
        fun reverse4(x: Int): Int {
            try {
                if (x > 0) {
                    return x.toString().reversed().toInt()
                } else {
                    return -Math.abs(x).toString().reversed().toInt()
                }
            } catch(e: NumberFormatException) {
                return 0
            }
        }


    fun reverse5(x : Int) : Int {
        return try {
            if (x > 0)
                x.toString().reversed().toInt()
            else
                -Math.abs(x).toString().reversed().toInt()
        } catch (e: java.lang.NumberFormatException) {
            0
        }

    }
}



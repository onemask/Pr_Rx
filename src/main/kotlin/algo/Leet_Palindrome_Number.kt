package algo

/**
 *  121 true
 *  -121 false
 *  10 false
 *
 */


class Leet_Palindrome_Number {

}

fun  main(){
    val answer = SolutionPalindrome()?.run {
        println(this.isPalindrome(10))
    }
}

class SolutionPalindrome {
    fun isPalindrome(x: Int): Boolean {
        if (x > 0) {
            if (x.toString().reversed()==x.toString())
                return true
        }
        return false
    }
}
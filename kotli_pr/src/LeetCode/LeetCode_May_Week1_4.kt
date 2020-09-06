package LeetCode/*
class LeetCode_May_Week1_4 {
    fun findComplement(num: Int): Int {
        print(" true ${ convertDecimalToBinary(10).toInt()}")
        //20161211
        return 0
    }

    fun convertDecimalToBinary(n: Int): Long {
        var n = n
        var binaryNumber: Long = 0
        var remainder: Int
        var i = 1
        var step = 1
        while (n != 0) {
            remainder = n % 2
            System.out.printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n / 2)
            n /= 2
            binaryNumber += (remainder * i).toLong()
            i *= 10
        }
        return binaryNumber
    }

    fun convertDecimalToBinary2(n: Int): Long {
        var n = n
        var binaryNumber: Long = 0
        var answer: Long = 0
        var remainder: Int
        var i : Long= 1
        var step = 1
        while (n != 0) {
            remainder = n % 2
            answer += if (remainder > 0) 0.toLong() * i else 1.toLong() * i
            System.out.printf(
                "Step %d: %d/2, Remainder = %d, Quotient = %d answer = %d \n",
                step++,
                n,
                remainder,
                n / 2,
                answer
            )
            n /= 2
            binaryNumber += (remainder * i).toLong()
            i *= 10
        }
        return binaryNumber
    }

    fun convertBinaryToDecimal(num: Long): Int {
        var num = num
        var decimalNumber = 0
        var i = 0
        var remainder: Long

        while (num.toInt() != 0) {
            remainder = num % 10
            num /= 10
            decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
            ++i
        }
        return decimalNumber
    }

}

fun Programers.LeetCode.Challenge.main() {
    //input 5 > 2
    //input 1  > 0
    print(LeetCode_May_Week1_4().findComplement(1))
}

*/

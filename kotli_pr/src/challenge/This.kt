package challenge

class This {
    private val primeSet = hashSetOf<Int>()
    fun solution(numbers: String): Int {
        var answer = 0
        val arr = numbers.toCharArray()
        for (i in 1..arr.size) {
            perm(arr, 0, arr.size, i)
        }
        return primeSet.size
    }

    //소수인가
    fun isPrime(num: Int): Boolean {
        if (num == 0) return false
        if (num == 1) return false
        if (num == 2) return true
        for (i in 2 until num) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }

    //순
    fun perm(arr: CharArray, depth: Int, n: Int, k: Int) {
        if (depth == k) {
            val text = StringBuilder()
            for (i in 0 until k) {
                if (i == k - 1) {
                    text.append(arr[i])
                } else {
                    text.append(arr[i])
                }
            }
            val num = text.toString().toInt()
            if (isPrime(num)) {
                primeSet.add(num)
            }
            return
        }
        for (i in depth until n) {
            swap(arr, i, depth)
            perm(arr, depth + 1, n, k)
            swap(arr, i, depth)
        }
    }

    fun swap(arr: CharArray, i: Int, j: Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}

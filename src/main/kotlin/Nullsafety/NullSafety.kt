package Nullsafety
    fun main() {
        val hi = "hi"
        val str : String? = "Not null"

        val elivis_String: String? = if (hi != null) "notnull" else "null"
        val elvis_short = null

        val lenth = str!!.length

        print("1")

        print("2")
/*dsdfsdf
        elvis_short?.let {
            print("I'm not null")
        } ?: run {
            print("I'm null")
        }*/


        val tellMe = isPossibleNull(null)!!

    }

    fun isPossibleNull(s: String?) {
        s?.let {
            print("I'm not null")
        } ?: run {
            null
        }
    }

    val data = Data("notnull","null"!!)

    class Data(
        val param : String?,
        val param2 : String
    )


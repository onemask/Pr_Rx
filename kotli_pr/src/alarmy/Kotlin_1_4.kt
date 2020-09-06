package alarmy

class Kotlin_1_4

fun main() {
    print("kotlin $ ${KotlinVersion.CURRENT}\"")
    //val isEven = IntPredicate { it % 2 == 0 }

    //Before Kotlin 1.4
    val before = object : Producer<String> {
        override fun produce() = "Hey"
    }


    val heyProducer = Producers { "Hey" }


    fun <A> produceNew(producer: Producer<A>) = producer.produce()

    produceNew(object : Producer<Int> {
        override fun produce(): Int = (0 until 10).random()
    })

    val logger = Cosumer<String> { a -> println(a) }
    val loggers = Cosumer { a: String -> println(a) }

    logger.cosumer("hello")
    loggers.cosumer("tt")

    val one = before(x = 1, 2)
    val two = before(1, y = 2)

    val after_one = after(str = "Challenge.This is a String!", false, wordSeparator = null)
}

fun before(x: Int, y: Int) {}

fun after(
    str: String,
    uppercaseFirstLetter: Boolean = true,
    wordSeparator: Char?
) {
}

//Before
interface Producer<A> {
    fun produce(): A
}

//After
fun interface Producers<A> {
    fun produce(): A
}


fun interface Consumers<A> {
    fun consumers(): A
}





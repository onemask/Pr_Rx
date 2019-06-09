package initalized

class initialized {
}

fun main(){
    val p = Person("elice")
    println("1 ${p.emails}")
}


class Email{}
    fun  loadEmail(person : Person) : List<Email>{
        print("${person.name}의 이메일을 가져옴")
        return listOf()
    }



class Person(val name : String){
    private var _emails : List<Email>? = null
    val emails : List<Email>
    get() {
        if(_emails==null){
            _emails = loadEmail(this)
        }
        return _emails!!
    }
}
/*

class Person(val name : String){
    val email by lazy { Email().loadEmail(this) }
}
*/

package initalized

class initialized {

}



class Email(){
    fun  loadEmail(person : Person) : List<Email>{
        print("${person.name}의 이메일을 가져옴")
        return person.emails
    }
}


class Person(val name : String){
    private var _emails : List<Email>? = null
    val emails : List<Email>
    get() {
        if(emails==null){
            _emails = Email().loadEmail(this)
        }
        return _emails!!
    }
}
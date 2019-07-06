package algo

class Leet_Jewls_and_Stones {
}

fun main(){
    val Jewls = SolutionJewls()
    print(Jewls.numJewelsInStones ("z","ZZ"))
}

class SolutionJewls{
    fun numJewelsInStones(J: String, S: String): Int {
        var answer = 0
        for(j in J){
          for(s in S){
              if(j==s){
                  answer++
              }
          }
        }
        return answer
    }
}

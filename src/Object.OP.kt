fun main(){
var Mandek= Details(firstName = "Mandek", lastName = "Adow", email = "adowmandek@gmail.com", phoneNumber = "0794764520", password = 345673)
println(Mandek.email)
    println(Mandek.lastName)
    println("I am eating $43 of food and $56 by the weight of food eaten")
    var x: Int=20
    print(++x)
}
class Human(name:String,age:Int,weight:Float){
    fun eat(){
        println("I am eating $43 of food and $56 by the weight of food eaten")
    }
    fun speak(speech:String){
        println(speech)
    }
    fun increament(){
       var x: Int=20
        ++x



    }



    }




data class Details( var firstName:String, var lastName:String, var email:String, val phoneNumber:String, val password:Int)










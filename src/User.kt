//class User {
   // var firstName:String=""
    //var lastName:String=""
class User constructor(var firstName:String,var lastName:String="Tamer"){
    fun printFullName(){
        println("$firstName $lastName")
    }
    fun printWithPrefix(prefix:String){
        println("$prefix $firstName")
    }
    fun updateFirstName(newName:String){
        firstName=newName

    }
    fun printNameLength(){
        println(firstName.length)

    }
}
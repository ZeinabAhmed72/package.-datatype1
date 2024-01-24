fun main() {
    //person("Tamer", 25)
person("Hassan", 18 , true ,"Devopler")
    println("===================")
    person("Omar", 25 ,false,"Devopler")
    println("===================")
    person("Hassan", 18 ,false,"Devopler")
    println("===================")

    person(name="Mohamed", age = 30 ,ishappy = false,"Devopler")
}



//}
//fun person (name:String,age :Int){
    //println("$name,and your age is $age")
//}

fun person(name:String,
           age :Int ,
           ishappy:Boolean,
           job:String)
{
    if(age< 21) println("$name,and your age is $age ,and yor job is $job")
     else println("sorry")
    println("your are happy?$ishappy")


}

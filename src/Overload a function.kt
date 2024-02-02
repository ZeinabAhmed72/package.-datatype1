fun main() {
    printUserInfo("Tamer")
    printUserInfo("Ahmed", 25)
    printUserInfo("Omar" ,1 , "Devolper")

}
fun printUserInfo(name:String){
    println("my name is $name")
}
fun printUserInfo(name:String ,age:Int){
    println("my name is $name,and my age is $age")
}

fun printUserInfo(name:String ,age:Int , job:String){
    println("my name is $name,and my age is $age , and my job is $job")
}

fun main() {
    printBookInfo("Hello kotlin","Tamer","Ahmed","Hassan")


}

fun printBookInfo(title:String , vararg authors:String){
println("$title - Authors: ")
    authors.forEach { println(it) }

}
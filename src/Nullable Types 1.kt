fun main() {
  //var name:String = "Zeinab"
   // name = null
   // println("name")

    var name:String? = "Zeinab"
     name = null
     println(name)

   // var first:String = "Omar"
    // first = null
   // println("first")

    var first:Int?= 1
     first = null
     println(first)

    println("===============================")

    var firstName:String?="Ahmed"
    firstName=null
    var length = firstName?.length
    println(length)

    println("======================")

    var lastName:String?="Omar"
    lastName=null
    var length2 = lastName?.length
    println(length2)

    println("=============")
    var length3=if(lastName!= null)lastName?.length else 0
    println(length3)

    println("======================")

    var lastName2:String="Mohamed"
    var length4= lastName2?.length
    println(length4)

    println("=============")
    var length5=lastName?.substring(0,2)?.length
    println(length5)

}
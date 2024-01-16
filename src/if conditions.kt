fun main() {

    var myAge= 25
    var yourAge =25

    //if ((yourAge==myAge) && (myAge==yourAge)){
      //  println(true)

    println(((yourAge!==myAge) && (myAge==yourAge)))

    println("=================================")

        //if ((yourAge!==myAge) || (myAge==yourAge)){
           // println(true)

    println(((yourAge!==myAge) || (myAge==yourAge)))

    println("=================================")


    //structural equality
    var name1 = "mohamed"
    var name2 ="mohamed"
    println(name1==name2)
    println(name1.equals(name2))

    println("=================================")

   //referential equality

    var obj1 = Person("tamer")
    var obj2 = Person("tamer")
    println(obj1===obj2)

}

class Person(var name: String) {

}



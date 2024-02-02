//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//var user=User()
  //  user.firstName="Mohamed"
   // user.lastName="Tamer"
    var user=User("Mohamed")
    user.printFullName()

    println("===========================")


    //var user2=User()
   // user2.firstName="Mohab"
   // user2.lastName="Tamer"
    var user2=User("Mohab")
    user2.printFullName()
    user2.updateFirstName("Hassan")
    user2.printWithPrefix("Mr,")
    user2.printNameLength()

println("===========================")

   // var user3=User()
    //user3.firstName="Zoza"
   // user3.lastName="Tamer"
    var user3=User("Zoza")
    user3.printFullName()
    user3.printWithPrefix("Ms,")
    user3.printNameLength()

}
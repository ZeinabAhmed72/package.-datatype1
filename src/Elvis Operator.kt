fun main() {
    //Elvis Operator

    var lastName2:String?="Mohamed"
    lastName2=null
    var length5=if (lastName2!=null) lastName2.length else 0
    println(length5)

    var length6=lastName2?.substring(0,4) ?.length ?: 0
    println(length6)

    println("=====================")
    var lastName3:String?="Mohamed"
    var length7=if (lastName3!=null) lastName3.length else 0
    println(length7)

    var length8=lastName3?.substring(0,4) ?.length ?: 0
    println(length8)

    println("=====================")
    // Double Bang Operator !!

    var name:String?="Mohamed tamer"
    var length9=name!!.length
    println(length9)


    var sayHi:String?="Hi"
    sayHi="Hi"
    var length10=name!!.length
    println(length10)


    var name2:String?=null
    var length11=name2?.length
    println(length11)
}
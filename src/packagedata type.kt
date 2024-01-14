
fun main() {
    val message1:String = """
        Hello,
        my name is ahmed.
        How are you?
    """.trimIndent()
    println(message1)

    println("============")


    val message2:String = """
        Hello,
        my name is ali.
        How are you?
    """.replaceIndent("- " )
    println(message2)

    println("============")

    val name:String = "Hassan"
    val age = 28
    println(name.length)
    println("Hello $name and your age is $age and your name is ${name.length} characters long")





}

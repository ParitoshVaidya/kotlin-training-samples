// Default arguments
fun greet(name: String, greeting: String = "Hello") {
    println("$greeting $name")
}


/*
Return types - Unit

fun printHello(name: String): Unit {}
fun printHello(name: String) {}

Single expression

fun addition(a: Int, b: Int): Int {
    return a + b
}

above function can be written as
fun addition(a: Int, b: Int) = a + b

*/


fun addition(a: Int, b: Int) = a + b

fun subtraction(a: Int, b: Int) = a - b
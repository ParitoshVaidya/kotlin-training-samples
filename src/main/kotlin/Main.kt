fun main(args: Array<String>) {
    // Default arguments
    greet("Paritosh")
    greet("Paritosh", "Hi")

    // Named arguments
    greet(name = "Paritosh")
    greet(name = "Paritosh", greeting = "Hi")
    greet(greeting = "Hi", name = "Paritosh") // valid

    // Higher order functions
    println(arithmeticOperation(2, 3, ::addition))
    println(arithmeticOperation(20, 3, ::subtraction))
}


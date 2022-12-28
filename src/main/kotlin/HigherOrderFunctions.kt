// Higher order functions - accepts or returns function as param
fun arithmeticOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
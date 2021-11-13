fun main() {
    val result1 = highOrderFunction(10, 20.5) { valueInt1, valueInt2, valueDouble1 ->
        valueInt1 + valueInt2 + valueDouble1
    }
    val result2 = highOrderFunction(20, 10.5) { valueInt1, valueInt2, valueDouble1 ->
        val finalValue = valueInt1 + valueInt2 - valueDouble1
        finalValue
    }

    println(result1)
    println(result2)
}

fun highOrderFunction(value1: Int, value2: Double, calculate: (Int, Int, Double) -> Double): Double {
    val result = calculate(value1, value1, value2)
    return result + 10
}
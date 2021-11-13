fun main() {

    val ranges = 1..10
    ranges.forEach {
        println(it)
    }

    println()

    val stepRanges = 1..10 step 2
    stepRanges.forEach {
        println(it)
    }

    println()

    val rangeIncrement = 1.rangeTo(10)
    rangeIncrement.forEach {
        println(it)
    }

    println()

    val rangeDecrement = 10.downTo(1)
    rangeDecrement.forEach {
        println(it)
    }

    println()
}
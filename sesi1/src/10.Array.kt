fun main() {

    val array = arrayOf<Int>(1, 3, 5, 4).sortedArray()
    val mixedTypeArray = arrayOf<Any>(1,3, 5, 7, "Kylix", true)

    println(array.toList())
    println(mixedTypeArray.toList())
}
package n_collections

fun main() {
    val integerSet = setOf(1, 2, 3, 4, 5, 5, 2)
    val charSet = setOf('A', 'B', 'C', 'D', 'A', 'C')

    println("""
        integerSet = $integerSet
        charSet    = $charSet
    """.trimIndent())

    val stringSet = mutableSetOf("Surabaya", "Malang", "Kediri", "Blitar")
    stringSet.add("Tulungagung")
    //stringSet.set(2, "Trenggalek")
    stringSet.remove("Surabaya")
    print(stringSet)
}
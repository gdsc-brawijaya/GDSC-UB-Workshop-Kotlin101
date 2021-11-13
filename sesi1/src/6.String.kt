fun main() {
    val text = "Kotlin"
    val firstChar = text[0]
    val lastChar = text[text.length - 1]
    println("$text, $firstChar, $lastChar")

    val stringFormat = String.format("$firstChar ${text[4]} $lastChar")
    println(stringFormat)

    val line = """
        Baris 1
        Baris 2
        Baris 3
    """.trimIndent()
    println(line)
}
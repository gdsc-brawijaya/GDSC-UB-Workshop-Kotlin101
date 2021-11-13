fun main() {
    val nullableText: String? = null
    println(nullableText)

    nullableText?.length

    val nonNullableText: String = nullableText!!
    println(nonNullableText)

    var safeNullableText: String? = null
    safeNullableText = nullableText ?: "Ini aman dari null"
}
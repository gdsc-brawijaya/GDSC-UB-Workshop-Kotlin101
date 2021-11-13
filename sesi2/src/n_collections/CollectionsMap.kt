package n_collections

fun main() {
    val capital = mutableMapOf(
        "Jakarta" to "Indonesia",
        "Tokyo" to "Japan",
        "Seoul" to "Korea",
        "Bangkok" to "Thailand",
        "Russia" to "Moscow"
    )

    println(capital.getValue("Jakarta"))
    println(capital["Jakarta"])

    val mutableCapital = mutableMapOf(
        "Jakarta" to "Indonesia",
        "Tokyo" to "Japan",
        "Seoul" to "Korea",
        "Bangkok" to "Thailand",
        "Moscow" to "Russia"
    )
    mutableCapital.put("Beijing", "China")
    mutableCapital.remove("Jakarta")
    mutableCapital.replace("Tokyo", "Nihon")
}
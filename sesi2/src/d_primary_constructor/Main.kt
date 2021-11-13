package d_primary_constructor

fun main() {
    val cat = Animal("Abdul", 2, 20.0)

    println("""
        Kucingku
        Nama: ${cat.name}
        Umur: ${cat.age}
        Tinggi: ${cat.height}
        Berat: ${cat.weight}
    """.trimIndent())

    cat.eat()
    cat.walk()
    cat.run()
}
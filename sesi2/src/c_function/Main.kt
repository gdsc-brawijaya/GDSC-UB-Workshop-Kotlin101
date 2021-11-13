package c_function

fun main() {
    val cat = Animal()
    cat.name = "Abdul"
    cat.age = 2
    cat.height = 20.0
    cat.weight = 8.5

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
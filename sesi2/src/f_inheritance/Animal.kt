package f_inheritance

open class Animal(
    val name: String,
    val age: Int,
    val weight: Double,
    val height: Double
    ) {

    var gender: String = "Male"

    fun eat() {
        println("$name memakan makanan favoritnya")
    }

    fun walk() {
        println("$name berjalan-jalan kesana kemari")
    }

    fun run() {
        println("$name sedang berlari-larian di halaman")
    }

    constructor(name: String, age: Int, weight: Double, height: Double, gender: String): this(name, age, weight, height) {
        this.gender = gender
    }
}
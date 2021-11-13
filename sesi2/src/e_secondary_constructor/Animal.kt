package e_secondary_constructor

class Animal(val name: String, val age: Int, val weight: Double, val height: Double) {

    lateinit var gender: String

    fun eat() {
        println("$name memakan makanan favoritnya")
    }

    fun walk() {
        println("$name berjalan-jalan kesana kemari")
    }

    constructor(name: String, age: Int, weight: Double, height: Double, gender: String): this(name, age, weight, height) {
        this.gender = gender
    }
}
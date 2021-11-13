package i_abstract_class

abstract class Animal(
    val name: String,
    val age: Int,
    val weight: Double,
    val height: Double
    ) {

    var gender: String = "Male"

    abstract fun eat()
    abstract fun eat(foodWeight: Double)
    abstract fun walk()

    open fun run() {
        println("$name sedang berlari-larian di halaman")
    }

    constructor(name: String, age: Int, weight: Double, height: Double, gender: String): this(name, age, weight, height) {
        this.gender = gender
    }
}
package j_interface

interface Animal {

    val name: String
        get() = "Tono"
    val weight: Double

    fun eat()
    fun eat(foodWeight: Double)
    fun walk()

    fun run() {
        println("$name sedang berlari-larian di halaman")
    }
}
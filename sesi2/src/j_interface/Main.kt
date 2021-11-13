package j_interface

fun main() {
    val cat = Mammal("Abdul", 2, 20.0, 8.5, "Female")
    cat.eat()
    cat.eat(1.0)
    cat.walk()
    cat.run()
    cat.breastFeeding()

    val dog = object : Animal {
        override val weight: Double
            get() = 20.0

        override fun eat() {
            println("$name sedang makan")
        }

        override fun eat(foodWeight: Double) {
            println("Berat badan naik menjadi ${weight + foodWeight}")
        }

        override fun walk() {
            "$name berjalan-jalan kesana kemari"
        }
    }

    dog.eat()
    dog.eat(1.0)
    dog.walk()
    dog.run()
}
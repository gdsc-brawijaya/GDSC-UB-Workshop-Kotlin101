package i_abstract_class

fun main() {
    val dog = object : Animal("Abdul", 2, 20.0, 8.5, "Female") {
        override fun eat() {
            println("$name merupakan seekor mamalia yang sedang makan")
        }

        override fun eat(foodWeight: Double) {
            println("Berat badan naik menjadi ${weight + foodWeight}")
        }

        override fun walk() {
            println("$name berjalan-jalan kesana kemari")
        }
    }
    dog.eat()
    dog.eat(2.5)
    dog.walk()
    dog.run()
}
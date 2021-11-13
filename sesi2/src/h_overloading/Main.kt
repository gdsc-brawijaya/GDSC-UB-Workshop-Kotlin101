package h_overloading

fun main() {
    val cat = Mammal("Abdul", 2, 20.0, 8.5, "Female")
    cat.eat()
    cat.eat(1.0)
    cat.walk()
    cat.run()
    cat.breastFeeding()
}
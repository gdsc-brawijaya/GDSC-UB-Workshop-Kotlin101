package d_primary_constructor

class Animal(val name: String, val age: Int, val weight: Double, val height: Double = 1.0) {

    fun eat() {
        println("$name memakan makanan favoritnya")
    }

    fun walk() {
        println("$name berjalan-jalan kesana kemari")
    }

    fun run() {
        println("$name sedang berlari-larian di halaman")
    }
}
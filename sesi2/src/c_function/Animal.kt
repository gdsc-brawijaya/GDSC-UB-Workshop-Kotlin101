package c_function

class Animal {
    var name: String = ""
    var age: Int = 0
    var weight: Double = 0.0
    var height: Double = 0.0

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
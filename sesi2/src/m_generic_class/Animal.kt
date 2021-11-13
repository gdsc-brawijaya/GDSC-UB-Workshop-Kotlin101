package m_generic_class

class Animal<T>(
    val name: T,
    val weight: Double
) {
    fun callTheName() {
        when (name) {
            is String -> println("Hello $name")
            is Int -> println("Nama seharusnya berupa String bukan Integer")
            is Double -> println("Nama seharusnya berupa String bukan Double")
        }
    }

    fun <V> eat(foodWeight: V) {
        when (foodWeight) {
            is String -> println("Makanan seharusnya berupa Number")
            is Int -> println("Berat badan menjadi ${weight + foodWeight}")
            is Double -> println("Berat badan menjadi ${weight + foodWeight}")
        }
    }
}
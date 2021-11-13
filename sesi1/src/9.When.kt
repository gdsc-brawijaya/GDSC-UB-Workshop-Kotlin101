fun main() {
    val value = 20
    when(value) {
        10 -> println("ini bernilai sepuluh")
        20 -> {
            println("ini bernilai dua puluh")
        }
        else -> println("nilai tidak ditemukan")
    }

    val returnValue = 55
    val stringValue = when(returnValue) {
        10 -> println("ini bernilai sepuluh")
        20 -> {
            println("ini bernilai dua puluh")
        }
        30 -> println("ini bernilai tiga puluh")
        45 -> println("ini bernilai empat puluh lima")
        else -> println("nilai tidak ditemukan")
    }
    println(stringValue)

    val anyValue: Any = 10
    when(anyValue) {
        is Int -> println("ini merupakan nilai berupa integer")
        is Double -> println("ini merupakan nilai double")
        is String -> println("ini merupakan nilai string")
    }

    val range = 1..50
    when(value) {
        in range -> print("masih di dalam range")
        !in range -> print("sudah di luar range")
    }

}
package m_generic_class

fun main() {
    checkGeneric(10)
    checkGeneric("Test")
    checkGeneric(2.0)
    checkGeneric(true)
}

fun <T> checkGeneric(param: T) {
    when(param) {
        is String -> println("Generic bertipe String")
        is Int -> println("Generic bertipe Int")
        is Double -> println("Generic bertipe Double")
        else -> println("Generic bertipe selain String, Int, atau Double")
    }
}
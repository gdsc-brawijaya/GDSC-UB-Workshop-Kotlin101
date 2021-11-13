package m_generic_class

fun main() {
    val cat = Animal<String>("Abdul", 2.0)
    val dog = Animal<Int>(1, 2.0)

    cat.callTheName()
    dog.callTheName()
}
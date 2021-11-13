/**
 * Number Data Type
 * Character Data Type
 * String Data Type
 * Boolean Data Type
 */
fun main() {

    val byte: Byte = 127
    val short: Short = 32767
    val int: Int = 2147483647
    val long: Long =  9223372036854775807
    val float: Float = 1.5F
    val double: Double = 1.5

    val char: Char = 'A'

    val string = "Hello this is String Data Type"

    val booleanTrue = true
    val booleanFalse = false

    print("""
        $byte
        $short
        $int
        $long
        $float
        $double
        $char
        $string
        $booleanTrue
        $booleanFalse
    """.trimIndent())
}
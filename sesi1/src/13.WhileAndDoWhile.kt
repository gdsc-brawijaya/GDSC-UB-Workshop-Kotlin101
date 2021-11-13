fun main() {
    var looping = 1
    val maxLooping = 5

    while (looping <= maxLooping) {
        println("nilai looping $looping (dari while)")
        looping++
    }

    looping = 1

    do {
        println("nilai looping $looping (dari do while)")
        looping++
    } while (looping >= maxLooping)
}
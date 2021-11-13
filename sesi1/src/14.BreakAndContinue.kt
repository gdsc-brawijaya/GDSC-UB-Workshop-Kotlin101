fun main() {
    val listOfData = listOf(1, 2, 3, 4, null, 6, 7, null, null)

    for (i in listOfData) {
        if (i == null)
            continue
        else
            print("$i ")
    }

    println()

    for (i in listOfData) {
        if (i == null)
            break
        else
            print("$i ")
    }
}
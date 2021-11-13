fun main() {
    helloWorld()

    callMyName("Kylix", "Blitar")

    val result = calculate(1, 2)
    print(result)
}

val helloWorld = {
    println("Hello Kotlin")
}

val callMyName = {name: String, location: String ->
    print("Halo Namaku $name, Aku tinggal di $location")
}

val calculate = { firstNumber: Int, secondNumber: Int ->
    val result = firstNumber + secondNumber
    result
}
package j_interface

class Mammal(
    val pName: String,
    val pAge: Int,
    val pWeight: Double,
    val pHeight: Double,
    val pGender: String
): Animal {

    fun breastFeeding() {
        println("$name menyusui anak-anaknya")
    }

    override val weight: Double
        get() = pWeight

    override val name: String
        get() = pName

    override fun eat() {
       println("$name merupakan seekor mamalia yang sedang makan")
    }

    override fun eat(foodWeight: Double) {
        println("Berat badan naik menjadi ${weight + foodWeight}")
    }

    override fun walk() {
        println("$name berjalan-jalan kesana kemari")
    }

    override fun run() {
        super.run()
        println("$name merupakan seekor mamalia yang sedang berlari")
    }
}
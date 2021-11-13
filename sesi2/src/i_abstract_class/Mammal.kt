package i_abstract_class

class Mammal(
    pName: String,
    pAge: Int,
    pWeight: Double,
    pHeight: Double,
    pGender: String
): Animal(pName, pAge, pWeight, pHeight, pGender) {

    fun breastFeeding() {
        println("$name menyusui anak-anaknya")
    }

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
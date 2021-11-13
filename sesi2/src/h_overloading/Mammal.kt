package h_overloading

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

    override fun walk() {
        super.walk()
    }

    override fun run() {
        super.run()
        println("$name merupakan seekor mamalia yang sedang berlari")
    }
}
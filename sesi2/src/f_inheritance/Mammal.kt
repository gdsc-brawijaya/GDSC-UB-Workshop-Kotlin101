package f_inheritance

class Mammal(
    pName: String,
    pAge: Int,
    pWeight: Double,
    pHeight: Double,
    pGender: String
): Animal(pName, pAge, pWeight, pHeight, pGender) {

    fun breastFeeding() {
        print("$name menyusui anak-anaknya")
    }
}
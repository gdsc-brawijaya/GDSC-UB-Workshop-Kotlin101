fun main() {

    val firstName = "Kylix"
    val lastName = "Eza"
    val name = setName(firstName, lastName)
    print(name)

    val street = "Jalan Anggrek No.3"
    val city = "Kota Blitar"
    setAddress(street, city)
}

fun setName(firstName: String, lastName: String): String {
    return firstName + lastName
}

fun setAddress(street: String, city: String) {
    val province = "Jawa Timur"
    print("$street, $city, $province")
}

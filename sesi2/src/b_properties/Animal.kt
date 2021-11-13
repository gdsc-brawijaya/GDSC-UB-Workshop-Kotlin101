package b_properties

class Animal {
    var name: String = ""
    get() {
        return field
    } set(value) {
        field = value
    }
    var age: Int = 0
    var weight: Double = 0.0
    var height: Double = 0.0
}
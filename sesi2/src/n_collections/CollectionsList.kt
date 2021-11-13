package n_collections

fun main() {
    val immutableNumberList: List<Int> = listOf(100, 200, 300, 400, 500)
    val immutableStringList: List<String> = listOf("Surabaya", "Malang", "Kediri", "Blitar")
    val immutableAnyList: List<Any?> = listOf(100, "Surabaya", true, 2.0, null)

    immutableAnyList.toMutableList()

    val mutableNumberList: MutableList<Int> = mutableListOf(100, 200, 300, 400, 500)
    val mutableStringList: MutableList<String> = mutableListOf("Surabaya", "Malang", "Kediri", "Blitar")
    val mutableAnyList: MutableList<Any?> = mutableListOf(100, "Surabaya", true, 2.0, null)

    mutableNumberList.add(600)
    mutableStringList.remove("Kediri")
    mutableAnyList.set(2, false)
}
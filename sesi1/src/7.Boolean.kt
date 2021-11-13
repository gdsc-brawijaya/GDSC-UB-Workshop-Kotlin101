fun main() {

    val current = 7
    val open = 8
    val close = 22

    val isOpen = current >= open && current <= close
    val isClose = current < open || current > close
    val isSame = isOpen == isClose
    val isNotSame = !isSame

    println("Apakah Janji Jiwa buka? $isOpen")
    println("Apakah Janji Jiwa tutup? $isClose")
    println("Apakah isOpen itu sama dengan isClose? $isSame")
    println("Apakah isOpen itu tidak sama dengan isClose? $isNotSame")
}
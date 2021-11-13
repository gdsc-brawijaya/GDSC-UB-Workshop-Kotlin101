fun main() {

    val current = 7
    val open = 8
    val close = 22

    if (current < open) {
        println("Toko buku belum buka")
    } else if (current > close) {
        println("Toko buku sudah tutup")
    } else {
        println("Toko buku sedang buka")
    }
}
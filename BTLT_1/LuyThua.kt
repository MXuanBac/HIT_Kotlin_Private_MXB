import kotlin.math.pow

fun main() {
    println("Nhập số nguyên dương n:")
    val n = readLine()!!.toInt()

    println("Nhập số nguyên dương k:")
    val k = readLine()!!.toInt()
    val result = n.toDouble().pow(k)
    println("Giá trị của nk: $result")
}
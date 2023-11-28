fun main() {
    println("Nhập số nguyên dương a:")
    val a = readLine()!!.toInt()

    println("Nhập số nguyên dương b:")
    val b = readLine()!!.toInt()

    // Tính tổng
    val sum = calculateSum(a, b)
    println("Tổng các số nguyên dương là ước của a nhưng không là ước của b: $sum")
}
fun calculateSum(a: Int, b: Int): Int {
    var sum = 0
    for (i in 1..a) {
        if (a % i == 0 && b % i != 0) {
            sum += i
        }
    }
    return sum
}
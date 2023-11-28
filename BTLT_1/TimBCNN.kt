fun findGCD(a: Int, b: Int): Int {
    if (b == 0) {
        return a
    }
    return findGCD(b, a % b)
}

fun findLCM(a: Int, b: Int, c: Int): Int {
    val gcdAB = findGCD(a, b)
    val lcmAB = a / gcdAB * b
    val gcdABC = findGCD(lcmAB, c)
    return lcmAB / gcdABC * c
}

fun main() {
    println("Nhập 3 số: ");
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()

    val lcm = findLCM(number1, number2, number3);

    println("Bội chung nhỏ nhất của 3 số là: " + lcm)
}
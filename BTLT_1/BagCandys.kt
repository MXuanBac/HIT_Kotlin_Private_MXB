fun main() {
    println("Nhập tổng số kẹo s:")
    val s = readLine()!!.toInt()

    val minBags = calculateMinBags(s)

    println("Số lượng túi tối thiểu để đựng kẹo: $minBags")
}

fun calculateMinBags(s: Int): Int {
    val bags5 = s / 5
    val bags2 = (s % 5) / 2
    val bags1 = (s - bags5 * 5 - bags2 * 2)
    val minBags = bags5 + bags2 + bags1

    return minBags
}
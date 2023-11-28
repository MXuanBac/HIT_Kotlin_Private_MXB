fun main() {
    println("Nhập chuỗi s:")
    val s = readLine()!!
    val count = countDistinctCharacters(s)
    println("Số kí tự khác nhau có trong chuỗi: $count")
}

fun countDistinctCharacters(s: String): Int {
    val distinctCharacters = s.toSet()
    return distinctCharacters.size
}
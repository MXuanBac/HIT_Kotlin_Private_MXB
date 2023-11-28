fun main() {
    println("Nhập số:")
    val number = readLine()!!

    val isPalindrome = checkPalindrome(number)
    if (isPalindrome) {
        println("YES")
    } else {
        println("NO")
    }
}
fun checkPalindrome(number: String): Boolean {
    val length = number.length
    for (i in 0 until length / 2) {
        if (number[i] != number[length - i - 1]) {
            return false
        }
    }
    return true
}
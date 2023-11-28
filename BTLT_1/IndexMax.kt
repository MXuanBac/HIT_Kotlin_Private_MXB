fun main() {
    println("Nhập số lượng phần tử của mảng:")
    val n = readLine()!!.toInt()

    println("Nhập các phần tử của mảng:")
    val array = IntArray(n) { readLine()!!.toInt() }

    var maxIndex = 0
    for (i in 1 until n) {
        if (array[i] > array[maxIndex]) {
            maxIndex = i
        }
    }

    println("Chỉ số của phần tử lớn nhất trong mảng là: " + (maxIndex + 1))
}
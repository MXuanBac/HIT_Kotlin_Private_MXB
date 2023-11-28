fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map {
        it.toInt()
    }
    var minDiff = Int.MAX_VALUE

    for (i in 1 until n) {
        for(j in i+1 until n) {
            val diff = Math.abs(arr[i] - arr[j])
            if (diff < minDiff) {
                minDiff = diff
            }
        }
    }

    println(minDiff)
}
fun main() {
    println("Nhập số nguyên dương n:")
    val n = readLine()!!.toInt()

    println("Nhập nhãn của người:")
    val labels = readLine()!!.split(" ").map {
        it.toInt()
    }
    val count = countPeopleWithDuplicates(labels)
    println("Số người có nhóm trong lớp: $count")
}

fun countPeopleWithDuplicates(labels: List<Int>): Int {
    val labelCounts = mutableMapOf<Int, Int>()
    var count = 0

    for (label in labels) {
        val currentCount = labelCounts.getOrDefault(label, 0)
        labelCounts[label] = currentCount + 1
    }

    for (Count in labelCounts.values) {
        if (Count > 1) {
            count++
        }
    }

    return count
}
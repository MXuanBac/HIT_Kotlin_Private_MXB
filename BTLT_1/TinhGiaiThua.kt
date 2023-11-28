fun main() {
    print("Nhap n: ");
    var n = readLine()!!.toInt();
    var kq = 1;
    while (n > 0) {
        kq *= n;
        n--;
    }

    println("Giai thua =" + kq);
}

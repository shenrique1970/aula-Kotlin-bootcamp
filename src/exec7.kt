import java.lang.Math.sqrt

fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    for (i in 0..x) {
        var y = readLine()!!.toDouble()
        val primo = ePrimo(y)
        print(primo)
    }
}

fun print(primo: Boolean) {
    if (primo) {
        println("prime")
    } else {
        println("not prime")
    }
}

fun ePrimo(num: Double): Boolean {

    if (num < 2) return false
        if (num % 2 == 0.0) return num == 2.0

    val quadra = sqrt(num).toInt()
    var i = 3

    while (i <= quadra) {
        if (num % i == 0.0) return false
        i += 2
    }
    return true



}
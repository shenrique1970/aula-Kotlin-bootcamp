fun main(args: Array<String>) {
    for (i in 2..100) {

        if (ePrimo(i) == true) {
            println(" $i - prime")
        }else {
            println("$i - not prime")
        }
    }
}

fun ePrimo(num: Int): Boolean {

    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false

        }
    }
    return true
}
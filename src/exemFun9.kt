fun main() {
    val a = 10
    val b = 20
    val c = 30
    calculaBonus(a, b, c)
}

fun calculaBonus(a: Int, b: Int, c: Int) {
    println("O BÔNUS É ${a + b * c * 2}")
}
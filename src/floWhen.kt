fun operacao(a: Int, b: Int, c: String): Int {
    when (c) {
        "soma" -> {
            return a + b
        }
        "subtração" -> {
            return a - b
        }
        else -> {
            return 0
        }
    }
    when {
        a > 0 && b > 0 -> {
            println("Variaveis maiores que 0")
        }
    }
    //range - intervalo de valores
    when (a) {
        in 1..99 -> {
            println("Século")
        }
    }
}







fun main() {
    operacao(10, 10, "soma")
    operacao(10, 8, "subtração")
}
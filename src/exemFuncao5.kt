fun main() {
    //operador elvis para evitar o erro nullPointerException
    val test: Int? = null
    val op: Int = test ?: 100 //se não tiver valor atribua 100 se não for nula atribua o valor de test
    println(op)
}
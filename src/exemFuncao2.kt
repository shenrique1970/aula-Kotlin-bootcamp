fun main() {
    val a = 10
    val b = 20
    println(hello2("Fulano"))
    println(soma(a, b))
}



fun hello2(nome: String) =  "Olá, $nome" //função de uma linha

fun soma(a: Int, b: Int) = a + b
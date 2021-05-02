fun main() {
    maiorIdade(10)
    maiorIdade(18)
    maiorIdade(27)

}

fun maiorIdade(idade: Int) {
    if (idade >= 18){
        println("maior de idade!")
    } else {
        println("não é maior de idade!")
    }
}
fun main() {
    maiorIdade2(10)
    maiorIdade2(18)
    maiorIdade2(27)

}

fun maiorIdade2(idade: Int) :Boolean {
    return if (idade >= 18){  //o proprio kotlin sugeriu essa mudança
        println("maior de idade!")
        idade >= 18


    } else {
        println("não é maior de idade!")
        idade < 18

    }
}
fun main(args: Array<String>) {
    var num1 = 5.8 //(0..10).random()
    var num2 = (1..10).random() //Não divide por 0
    var oper = (1..4).random()

    //if

    println("Primeiro numero: $num1")
    println("Segundo numero: $num2")
    println()
    println("1 - soma")
    println("2 - subtração")
    println("3 - multiplicação")
    println("4 - divisão")

    println()
    var operString = when(oper) {
        1 -> {print("A operação escolhida foi soma: "); print(num1+num2)}
        2 -> {print("A operação escolhida foi subtração: "); print(num1-num2)}
        3 -> {print("A operação escolhida foi multiplicação: "); print(num1*num2)}
        4 -> {print("A operação escolhida foi divisão: "); print(num1/num2)}
        else -> "Argumento fora do limite"
    }
}
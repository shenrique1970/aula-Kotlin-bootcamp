fun main() {
    println(calculaBonus("coordenador", 1000f)) //usa print porque na função é retun
    println(calculaBonus("Gerente senior", 1000f))
    println(calculaBonus("Gerente junior", 1000f))
}
fun calculaBonus(cargo: String, salario: Float) : Float {
    // gerente junior, gerente senior, coordenador


    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente junior") {
        salario * 0.5f
    } else {
        salario * 2
    }
}

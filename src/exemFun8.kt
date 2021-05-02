fun main() {
    println(calculaBonus2("coordenador", 1000f)) //usa print porque na função é retun
    println(calculaBonus2("Gerente senior", 1000f))
    println(calculaBonus2("Gerente junior", 1000f))
}

fun calculaBonus2(cargo: String, salario: Float) : Float {
    // gerente junior, gerente senior, coordenador

    return when (cargo) {
        "Coordenador" -> {
            salario * 0.2f
        }
        "Gerente junior" -> {
            salario * 0.5f
        }
        else -> {
            salario * 2
        }
    }

}
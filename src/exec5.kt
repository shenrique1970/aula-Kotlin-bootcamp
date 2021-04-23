fun main(args: Array<String>) {
    //continue a solução
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val v = readLine()!!.toDouble()
    var i = 0.0
    val d : Double

    when {
        v > 4500 -> {
            i = 1000 * 0.08 + 1500 * 0.18 // A TAXA INSIDE APENAS SOBRE 1000
            d = v - 4500 //
            i += d * 0.28 //
        }
        v > 3000 -> {
            i = 1000 * 0.08
            d = v - 3000
            i += d * 0.18
        }
        v > 2000 -> {
            d = v - 2000
            i += d * 0.08
        }
    }
    if (i == 0.0) println("Isento") else println("R$ ${i.format(2)}")


}
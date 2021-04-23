import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*
import kotlin.math.pow

fun main(args: Array<String>)
{
    val r = readLine()?.toDouble()
    val pi = 3.14159

    r?.let { //resultado não nullo
        val a = pi*r.pow(2)
        val res = BigDecimal(a).setScale(4, RoundingMode.HALF_EVEN) //4 casas

        println("A=$res")
    }
}
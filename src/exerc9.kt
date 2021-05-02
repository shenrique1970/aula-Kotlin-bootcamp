import java.util.Scanner
//para o desafio bob conduit
fun main(args:Array<String>) {
        val entrada = Scanner(System.`in`)
        val num = entrada.nextInt()
        for (i in 0 until num)
        {
            val n = entrada.nextInt()
            val n2 = entrada.nextInt()
            println(n + n2)
        }
}

// Aula 02 - Tipos de variáveis

fun main(args: Array<String>) {
    /*
        String - Textos
        byte - Números Inteiros (-128 até 127)
        int - Números Inteiros (-2147483648 até 2147483647)
        long - Números Inteiros (-9223372036854775808 até 9223372036854775808)
        floot - Números Decimais (1.1234567 até 7 casas decimais)
        double - Números Decimais (1.123456789 até 15 casas decimais)
        boolean - Valores Booleanos (Estados) - true ou false
    */

    val nomeCompleto = "Dean Winchester"
    val idade: Byte = 27
    val age = 27
    val numeroInteiro = 2147483647
    val aquiELongo = 2147483648
    val numeroLong = 922337203685477581
    val money = 79.35f
    val pi = 3.14159265
    val verdadeiro = true
    val falso = false

    println(nomeCompleto)
    println(idade)
    println(age)
    println(numeroInteiro)
    println(aquiELongo)
    println(numeroLong)
    println(money)
    println(verdadeiro)
    println(falso)

}

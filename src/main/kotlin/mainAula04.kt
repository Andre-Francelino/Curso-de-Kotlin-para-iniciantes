// Aula 04 - Operadores Aritméticos

fun main(args: Array<String>) {
    /*
        + soma
        - subtração
        * multiplicação
        / divisão
        % módulo (resto da divisão)
        ++ incremento
        -- decremento
    */

    var numero1 = 20
    var numero2 = 10
    var n1 = 50
    var n2 = 10

    var soma = n1 + n2
    var subtracao = n1 - n2
    var multiplicacao = n1 * n2
    var divisao = n1 / n2
    var resto = n1 % n2
    var incremento = ++n1
    var decremento = --n2


    println(numero1 + numero2)
    println(numero1 - numero2)
    println(numero1 * numero2)
    println(numero1 / numero2)
    println(numero1 % numero2)
    println(++numero1)
    println(--numero2)
    println("")

    println("O resultado da soma é: $soma")
    println("O resultado da subtração é: $subtracao")
    println("O resultado da multiplicação é: $multiplicacao")
    println("O resultado da divisão é: $divisao")
    println("O resto da divisão é: $resto")
    println("Ao incrementar mais um o resultado é: $incremento")
    println("Ao decrementar menos um o resultado é: $decremento")

}















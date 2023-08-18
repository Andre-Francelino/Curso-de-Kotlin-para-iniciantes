import java.util.Arrays

// Aula 08 - Arrays

fun main(args: Array<String>) {

    var listaCompras = arrayOf("Arroz", "Feijão", "Batata", "Uva", "Banana", "Carne", "Leite", "Ovos", "Frango", "Queijo")
    var listaNumeros = arrayOf(10, 34, 40, 58, 77, 2.58)

    // se imprimir apenas o nome da lista irá retornar o seu espaço armazenado na memória
    println(listaCompras)
    println(listaNumeros)

    // imprimir o item no índice 8 na lista de compras e o item no indice 4 na lista de números
    println(listaCompras[8])
    println(listaNumeros[4])

    // imprimir todos os itens da lista -> utiliza o Arrays do java.util e chama o método .toString na lista
    println(Arrays.toString(listaCompras))
    println(Arrays.toString(listaNumeros))

    // imprimir o tamanho da lista -> utiliza o método .size na lista
    println(listaCompras.size)
    println(listaNumeros.size)

}

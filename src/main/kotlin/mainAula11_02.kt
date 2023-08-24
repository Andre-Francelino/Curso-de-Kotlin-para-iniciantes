// Aula 11 - Estrutura WHEN (estrutura que equivale ao Switch...Case do java)

fun main(args: Array<String>) {

    var opcaoBandaThrash = 13

    var mensagem = when(opcaoBandaThrash) {
        1 -> "Metallica"
        2 -> "Nuclear Assault"
        3 -> "Slayer"
        4 -> "Anthrax"
        5 -> "Megadeth"
        6 -> "Testament"
        7 -> "Exodus"
        8 -> "Sepultura"
        9 -> "Korzus"
        10 -> "Kreator"
        11 -> "Destruction"
        12 -> "Sodom"
        else -> "Nenhum opção de banda foi selecionada."
    }

    println(mensagem)
}
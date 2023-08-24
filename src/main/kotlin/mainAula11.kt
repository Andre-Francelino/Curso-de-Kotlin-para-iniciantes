// Aula 11 - Estrutura WHEN (estrutura que equivale ao Switch...Case do java)

fun main(args: Array<String>) {
    var jogosSega = 7

    when (jogosSega) {
        1 -> println("Sonic The Hedgehog")
        2 -> println("Streets Of Rage")
        3 -> println("Comix Zone")
        4 -> println("Mortal Kombat Ultimate")
        5 -> println("Altered Beast")
        6 -> println("Shadow Dancer: The Secret of Shinobi")
        7 -> println("Teenage Mutant Ninja Turtles - The Hyper Heist")
        8 -> println("Super Street Fighter II")
        9 -> println("Phantasy Star II")
        10 -> println("Golden Axe")
        else -> println("Nenhuma opção de jogo foi selecionada")
    }
}
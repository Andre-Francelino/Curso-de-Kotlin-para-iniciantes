// Aula 10 - Estrutura de repetição FOR

fun main(args: Array<String>) {

    var listaSeries = arrayOf("Supernatural", "Prison Break", "Vikings", "Daredevil", "The Punisher",
        "How I Met Your Mother", "Everybody Hates Chris", "Chapolin Colorado", "Breaking Bad", "The Big Bang Theory")

    var indice = 0

            // poderia ser também (indice in 0 .. 9)
    for (indice in 0..listaSeries.size-1) {
        println(listaSeries[indice])
    }

}

// Aula 09 - Estrutura de repetição WHILE

fun main(args: Array<String>) {

    var listaBaixistas = arrayOf("Cliff Burton", "Steve Harris", "Geddy Lee", "Nico Assumpção", "Arthur Maia",
        "Jaco Pastorius", "Victor Wooten", "James Jamerson", "Michael Pipoquinha", "Jason Newsted", "Champignon")

    var indice = 0

    // Estrutura de repetição - while (enquanto)

          //poderia ser (indice <= 9) 9 é o tamanho da lista
    while (indice <= listaBaixistas.size-1) {
        println(listaBaixistas[indice])
        indice++
    }

}

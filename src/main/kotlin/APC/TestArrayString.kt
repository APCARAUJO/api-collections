package APC

fun main() {
    val nomes = Array(5){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Jose"
    nomes[3] = "Pedro"
    nomes[4] = "Rosa"

    for (nome in nomes) {
        println(nome)
    }

    println("-------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Jose", "Pedro", "Rosa", "Joao")
    println("-------------------ArrayOf")
    nomes2.sort()
    nomes2.forEach { println(it) }

    println("-------------------")
    println(nomes2[0])


}
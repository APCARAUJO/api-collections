package APC

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()

    )

    println("------------------------")
    println("Soma de Salarios: R$ " + salarios.somatoria())

    println("------------------------")
    println("Media salarial: R$ " + salarios.media())
}

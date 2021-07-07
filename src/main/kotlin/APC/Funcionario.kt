package APC

data class Funcionario(
    val nome : String,
    val salario : Double,
    val tipoContracao : String,

    ){
    override fun toString(): String =
        """
            nome : $nome
            salario : $salario
        """.trimIndent()



}

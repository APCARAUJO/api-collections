package APC

fun main(){
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4500.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)


    println("----------------------")
    funcionarios.forEach { println(it) }

    println("----------------------")
    println(funcionarios.find{it.nome == "Maria"})

    println("----------------------")//Encadeamento metodo coletor
    funcionarios.sortedBy { it.salario }
        .forEach { println (it)
        }

    println("----------------------")//Encadeamento GroupBY-Tipo de contrato
    funcionarios.groupBy{ it.tipoContracao }
        .forEach { println (it)
        }

}










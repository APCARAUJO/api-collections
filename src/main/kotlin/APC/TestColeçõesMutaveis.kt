package APC

fun main(){
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4500.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("--------------------")//Adicionar funcionario
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    println("--------------------")//Remover funcionario
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("--------------------")//SET
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{println(it)}

    println("--------------------")//SET + ADD
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{println(it)}

    println("--------------------")//remove
    funcionarioSet.remove(maria)
    funcionarioSet.forEach{println(it)}
}
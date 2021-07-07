package APC

fun main(){
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4500.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionario2)//Union
    resultUnion.forEach{println(it)}

    println("------------------------")//Subtract
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios1.union(funcionario2)
    resultSubtract.forEach{println(it)}

    println("------------------------")//Interset
    val resultInterset = funcionarios3.intersect(funcionario2)
    resultInterset.forEach{println(it)}


}
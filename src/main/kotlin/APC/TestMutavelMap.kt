package APC

fun main(){
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4500.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.finById(maria.nome))

    println("-----------------------")//Retorna todos os Ts ou todos os valores

    repositorio.findALL().forEach { println(it) }

    println("-----------------------")//Remover item da lista
    repositorio.remove(maria.nome)
    repositorio.findALL().forEach { println(it) }


}
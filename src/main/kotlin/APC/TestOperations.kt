package APC

fun main() {
    val salarios = doubleArrayOf(1000.0, 5000.0, 2079.0, 4230.0, 3150.0, 4010.0, 3000.0, 4000.0, 3200.0,  1500.0,   )

    println("\n-----------------------")//Impressão Simples
    for (salario in salarios) {
        println(salario)
    }

    println("-----------------------")//Filtros
    println("Maior Salario: R$ ${salarios.maxOrNull()}\n")//Forma atualizada
    println("Menor Salario: R$ ${salarios.minOrNull()}\n")//Forma atualizada
    println("Media SalariaL: R$ ${salarios.average()}\n")

    val salariosMaiorQue2500 = salarios.filter { it > 2500 }
    println("-----------------------")//SalariosMaiorQue2500
    salariosMaiorQue2500.forEach{println(it)}

    println("-----------------------")//Filtros Contar
    println(salarios.count{it in 2000.0 .. 5000.00})

    println("-----------------------")//Filtros Find
    println("R$ " + salarios.find{ it == 3150.0 })

    println("-----------------------")//Filtros Ex. Conta Cliente
    println(salarios.find{it == 500.0 })

    println("-----------------------")//Filtros valores validos
    println(salarios.any{it == 4010.0 })
    println(salarios.any{it == 500.0 })





}
package APC

fun main(){

    val salarios = DoubleArray(10)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 4000.0
    salarios[3] = 1500.0
    salarios[4] = 1890.0
    salarios[5] = 2000.0
    salarios[6] = 2200.0
    salarios[7] = 3300.0
    salarios[8] = 3200.0
    salarios[9] = 2230.0

    println("--------------------")
    salarios.forEach { println(it)}

    println("--------------------")
    salarios.forEachIndexed{ index, salario ->
        salarios[index] = salario * 1.1

    }

    salarios.forEach { println(it) }

    println("--------doubleArrayOf------------")
    val salario2 = doubleArrayOf(1500.0, 1250.0, 2010.0)
    salario2.sort()
    salario2.forEach { println(it) }

}
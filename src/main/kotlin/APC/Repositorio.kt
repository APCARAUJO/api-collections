package APC


class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(Id: String, value: T){
       map[Id] = value
    }

    fun remove(Id: String) = map.remove(Id)

    fun finById(Id: String) = map[Id]

    fun findALL() = map.values


}
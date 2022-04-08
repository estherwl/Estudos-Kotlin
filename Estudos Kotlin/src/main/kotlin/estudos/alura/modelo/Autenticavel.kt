package estudos.alura.modelo


interface Autenticavel {

    fun autentica(senha: Int): Boolean

}

//Não mantêm estados (valores)
//Não são instanciadas (são implicitamente abstracts)
//Podem ter properties, mas sempre abstracts. Possuem comportamento similar ao
//de uma função: não armazenam estado, ao invés disso, devolvem valor

//poderia ter implementação uma implementação geral para
//toda classe que implementasse a interface
//Porém, cuidar com informações sensiveis que poderiam existir nas properties,
//já que elas precisariam ser public
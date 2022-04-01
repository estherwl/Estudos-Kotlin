package estudos.alura.teste

import estudos.alura.modelo.Autenticavel

//“Object Expression” permite a crição de objetos anônimos, ao criar objetos sem
// estrutura de classe

fun testaObjectExpression() {
//aqui permite usar polimorfismo, fazendo com que esse “Cliente”
// seja autenticável e utilize o sistema interno.

    val ana = object : Autenticavel {
        val nome: String = "ana"
        val cpf: String = "1111111111"
        val senha: Int = 100

        override fun autentica(senha: Int) = this.senha == senha
    }

}



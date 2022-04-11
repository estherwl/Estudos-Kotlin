package estudos.alura.teste

import estudos.alura.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", cidade = "poa")

    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoCidade: Int =
            it.cidade?.length ?: throw IllegalStateException("cidade não pode ser vazio")
        println(tamanhoCidade)
    }
    teste("")
    teste(1)
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int   //cast safe
    println(numero)
}

//let -> uma das scope functions (pega o objeto e traz pra dentro da função)
//it.cidade?.length -> safe call (verifica se é um nulo, se não for, retorna length)
//?: -> Evils operator (verifica se é nulo, se for, retorna algo - no exemplo, uma exception)

//not-null assertion operator(!!) -> evitar usar
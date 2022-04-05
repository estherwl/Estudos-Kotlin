package estudos.alura.modelo

class Endereco(
    var logradouro: String= "",
    var numero: Int = 0,
    var cidade: String = ""
){
    override fun toString(): String {
        return """Endereco(logradouro='$logradouro', 
            numero=$numero, 
            cidade='$cidade')""".trimIndent()
    //""" mostra que é uma raw string, ele concatena o texto, mas cada linha
    //nova é uma linha que ele realmente pulará ao mostrar o texto
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true //verifica se a referencia é a mesma
        if (javaClass != other?.javaClass) return false //valida se não é null e se nome da classe são iguais

        other as Endereco //depois de validar, faz casting

        if (logradouro != other.logradouro) return false //compara cada propertie
        if (numero != other.numero) return false
        if (cidade != other.cidade) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + cidade.hashCode()
        return result
    }
}

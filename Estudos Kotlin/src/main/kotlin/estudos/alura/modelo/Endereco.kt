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
}

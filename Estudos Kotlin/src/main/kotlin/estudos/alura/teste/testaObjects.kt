package estudos.alura.teste

import estudos.alura.modelo.Endereco
import estudos.alura.modelo.Funcionario

fun main() {
    val endereco = Endereco()
    imprime(3)
    imprime("oi")
    imprime(Unit) //representa um objeto que não é devolvido
    imprime(endereco)

    //tudo é um objeto em Kotlin, as vezes funcionam de forma diferente na execução, mas
    //são objetos da mesma forma (inclusive tipos primitivos)

}
//Any é a classe mãe de todas
fun imprime(valor: Any) {
//smart cast: faz conversão na hora, sem precisar atribuir a outra variavel e
// tbm valida (nesse caso, só faz cast dependendo do tipo de dado)
    if(valor is Int){
        println(valor + 1)
    }
    println(valor)
}
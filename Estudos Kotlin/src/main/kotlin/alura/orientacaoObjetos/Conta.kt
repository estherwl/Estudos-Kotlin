package alura.orientacaoObjetos

//construtor pode ter valores padrão, ex: class Conta(val titular: String="esther", val numero: Int)
//ou seja, ao criar o objeto se não declarar outro valor, terá o valor padrão
class Conta(val titular: String, val numero: Int){
    var saldo = 0.0
        private set
    //saldo só pode ser modificado através da classe, já que set é privado

    fun deposita(conta: Conta, valor: Double){
        if(valor > 0) conta.saldo += valor
    }

    @Throws(Exception::class)
    fun saca(valor: Double){
        if(saldo < valor) {
            throw Exception("Saldo insuficiente")
        }
        saldo -= valor
        println("Saldo atualizado: $saldo")
    }

    fun transfere(destino: Conta, valor: Double){
        saca(valor)
        deposita(destino, valor)
    }


}
package com.alura.oop

//construtor pode ter valores padrão, ex: class Conta(val titular: String="esther", val numero: Int)
//ou seja, ao criar o objeto se não declarar outro valor, terá o valor padrão
abstract class Conta(val titular: String, val numero: Int){
    var saldo = 0.0
        protected set
    //saldo só pode ser modificado através da classe, já que set é privado

    fun deposita(conta: Conta, valor: Double){
        if(valor > 0) conta.saldo += valor
    }

    @Throws(Exception::class)
    abstract fun saca(valor: Double)

    fun transfere(destino: Conta, valor: Double){
        saca(valor)
        deposita(destino, valor)
    }


}
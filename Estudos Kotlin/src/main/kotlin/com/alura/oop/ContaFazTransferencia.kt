package com.alura.oop

abstract class ContaFazTransferencia(
    titular: String,
    numero: Int
): Conta(titular = titular,
    numero = numero) {

    fun transfere(destino: ContaFazTransferencia, valor: Double){
        saca(valor)
        deposita(destino, valor)
    }

}
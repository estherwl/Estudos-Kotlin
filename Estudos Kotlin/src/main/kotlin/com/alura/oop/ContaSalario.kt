package com.alura.oop

class ContaSalario(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(saldo < valor) {
            throw Exception("Saldo insuficiente")
        }
        saldo -= valor
        println("Saldo atualizado: $saldo")
    }
}
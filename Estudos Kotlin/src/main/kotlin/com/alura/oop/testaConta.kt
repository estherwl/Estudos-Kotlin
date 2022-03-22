package com.alura.oop

fun main() {
    val contaFabi = ContaCorrente("Fabi", 11222)
    val contaJoao = ContaCorrente("João", 11223)

    contaFabi.deposita(contaFabi, 500.00)
    contaFabi.transfere(contaJoao, 100.00)

    contaFabi.saca(200.00)
    contaJoao.saca(10.00)
}
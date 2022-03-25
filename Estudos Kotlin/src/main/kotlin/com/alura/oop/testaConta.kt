package com.alura.oop

fun testaComportamentoConta() {
    //labels (identificação titular e numero abaixo, por exemplo, ajudam na visualização do código
    //e permitem que parametros sejam colocados em ordem diferente da apresentda no construtor
    val contaEsther = ContaCorrente(titular = "Esther Lucena", numero = 11222)
    val contaPaulo = ContaPoupanca(numero = 11223, titular = "Paulo Nunes")

    contaEsther.deposita(contaEsther, 200.00)
    contaEsther.saca(100.00)
    contaEsther.transfere(contaPaulo, 100.00)

    println("Saldo contaPaulo: ${contaPaulo.saldo}")
}

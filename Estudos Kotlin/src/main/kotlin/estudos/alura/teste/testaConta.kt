package estudos.alura.teste

import estudos.alura.modelo.Cliente
import estudos.alura.modelo.Conta
import estudos.alura.modelo.ContaCorrente

fun testaComportamentoConta() {
    val Paulo = Cliente("Paulo", 2)

    //labels (identificação titular e numero abaixo), por exemplo, ajudam na visualização do código
    //e permitem que parametros sejam colocados em ordem diferente da apresentda no construtor
    val contaEsther = ContaCorrente(titular = Cliente(
        "Esther",
        1) ,
        numero = 11222)
    val contaPaulo = estudos.alura.modelo.ContaPoupanca(numero = 11223, titular = Paulo)

    contaEsther.deposita(contaEsther, 300.00)
    contaEsther.saca(100.00)
    contaEsther.transfere(contaPaulo, 100.00)

    println("Saldo contaPaulo: ${contaPaulo.saldo}")
    println("Total de contas: ${Conta.Contador.total}")
}

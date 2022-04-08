package estudos.alura.modelo

import estudos.alura.exception.SaldoInsuficienteException

abstract class ContaFazTransferencia(
    titular: Cliente,
    numero: Int,

    ) : Conta(
    titular = titular,
    numero = numero
) {

    fun transfere(destino: ContaFazTransferencia, valor: Double) {
        if(saldo < valor){
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente"
            )
        }
        saca(valor)
        deposita(destino, valor)
    }

}
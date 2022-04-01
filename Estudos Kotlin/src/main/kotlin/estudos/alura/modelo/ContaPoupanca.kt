package estudos.alura.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : estudos.alura.modelo.ContaFazTransferencia(
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
package estudos.alura.modelo

class ContaCorrente(
    titular: String,
    numero: Int
) : estudos.alura.modelo.ContaFazTransferencia(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(saldo < valorComTaxa) {
            throw Exception("Saldo insuficiente")
        }
        saldo -= valorComTaxa
        println("Saldo atualizado: $saldo")
    }
}

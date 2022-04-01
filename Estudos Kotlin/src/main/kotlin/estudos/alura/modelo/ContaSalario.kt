package estudos.alura.modelo

class ContaSalario(
    titular: Cliente,
    numero: Int
) : estudos.alura.modelo.Conta(
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
package estudos.alura.modelo

abstract class ContaFazTransferencia(
    titular: Cliente,
    numero: Int,

    ) : estudos.alura.modelo.Conta(
    titular = titular,
    numero = numero
) {

    fun transfere(destino: estudos.alura.modelo.ContaFazTransferencia, valor: Double) {
        saca(valor)
        deposita(destino, valor)
    }

}
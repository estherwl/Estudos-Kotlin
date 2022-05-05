package estudos.funcionalidades

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    //cria arrayBigDecimal
    fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
        return Array<BigDecimal>(valores.size) { i ->
            valores[i].toBigDecimal()
        }
    }

    //cria Array salarios
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    //calcula aumento relativo a cada salario
    fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
            : BigDecimal {
        return if (salario < "5000".toBigDecimal()) {
            salario + "500".toBigDecimal()
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }

    //com map transforma array de salários atual para um novo array de salários com aumento
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

}
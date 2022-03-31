package estudos.alura.teste

import com.alura.modelo.*

fun testaFuncionario() {
    val gerente = estudos.alura.modelo.Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    val diretor = estudos.alura.modelo.Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 5678,
        plr = 200.0
    )

    val calculadora = estudos.alura.modelo.CalculadoraBonificacao()
    calculadora.registra(gerente)
    calculadora.registra(diretor)

    println("total de bonificação: ${calculadora.total}")

    val sistema = estudos.alura.modelo.SistemaInterno()
    sistema.entra(gerente, 1111)
    sistema.entra(diretor, 5678)
}
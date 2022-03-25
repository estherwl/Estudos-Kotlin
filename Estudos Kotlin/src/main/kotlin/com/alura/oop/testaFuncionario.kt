package com.alura.oop

fun testaFuncionario() {
    val gerente = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 5678,
        plr = 200.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gerente)
    calculadora.registra(diretor)

    println("total de bonificação: ${calculadora.total}")

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1111)
    sistema.entra(diretor, 5678)
}
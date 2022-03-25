package com.alura.oop

//Se a interface fosse implementada aqui ao invés de em FuncionarioAdmin, não precisaria
// implementar método da interface, pq já teria sido implementado em FuncionarioAdmin

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){
    override val bonificacao: Double
        get() {
            return salario
        }
}

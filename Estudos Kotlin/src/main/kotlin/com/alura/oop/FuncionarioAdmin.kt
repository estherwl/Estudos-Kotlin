package com.alura.oop

//abstract não precisa colocar open (já é por default)
//open: hábil de ser herdada (Open to share properties with anyone)
abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(nome = nome, cpf = cpf, salario = salario) {
    fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }

    //abstract val bonificacao: Double
    //não precisa implementar, pois classe tbm é abstract
}
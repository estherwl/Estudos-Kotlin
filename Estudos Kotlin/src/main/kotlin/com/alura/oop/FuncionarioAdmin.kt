package com.alura.oop

//abstract não precisa colocar open (já é por default)
//open: hábil de ser herdada

//Implementa a interface pois em SistemaInterno admin é definido
//como autenticável
//Qualquer funcionárioAdmin autentica, mas poderia implementar direto nas
// classes que herdam de funcionarioAdmin

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
): Funcionario(nome = nome, cpf = cpf, salario = salario), Autenticavel {
     override fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }

    //abstract val bonificacao: Double
    //não precisa implementar, pois classe tbm é abstract
}
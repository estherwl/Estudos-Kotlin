package com.alura.oop

class SistemaInterno {
    fun entra(funcionarioAdmin: FuncionarioAdmin, senha: Int){
        if(funcionarioAdmin.autentica(senha)){
            println("Bem vindo")
        } else {
            println("Falha na autenticação")
        }
    }
}
package com.alura.oop

//Tanto cliente quanto funcionário podem autenticar
//visto que um admin é uma referencia que implementa Autenticavel

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo")
        } else {
            println("Falha na autenticação")
        }
    }
}
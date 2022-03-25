package com.alura.oop

//Como um cliente não é um funcionário, ele pode
//autenticar através da Interface Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
): Autenticavel {
    override fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}

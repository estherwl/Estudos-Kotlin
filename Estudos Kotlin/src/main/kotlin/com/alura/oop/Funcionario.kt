package com.alura.oop

//abstract não precisa colocar open (já é por default)
//open: abil de ser herdada (Open to share properties with anyone)
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    abstract val bonificacao: Double
}
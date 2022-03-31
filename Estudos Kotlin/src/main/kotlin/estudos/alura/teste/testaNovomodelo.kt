package estudos.alura.teste

import estudos.alura.modelo.Cliente
import estudos.alura.movomodelo.Cliente as novoCliente

fun testaNovomodelo() {
    val cliente = estudos.alura.modelo.Cliente(nome = "Esther", senha = 222)

    //Kotlin permite dar um "apelido" para o package, ajudando em conflitos
    //se não tivesse dado apelido, precisaria usar opção 1, já que o import
    //da conflito ao ter o mesmo nome de classe

    val novoCliente =
        estudos.alura.movomodelo.Cliente(nome = "Esther", senha = 222) //opção 1, não conseguindo usar import
    val novoCliente2 = novoCliente(nome = "Esther", senha = 222) //opção 2, com apelido e import
}

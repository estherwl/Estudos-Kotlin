package estudos.alura.modelo

class Cliente(
    val nome: String,
    private val senha: Int,
    val endereco: Endereco = Endereco()
): Autenticavel {
    override fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}

//Como um cliente não é um funcionário, ele pode
//autenticar através da Interface Autenticavel

//Ao instanciar o endereço no construtor(com valores ja inicializados na classe)
//o endereço se torna opcional, já que fica subentendido que cada cliente já vem
// com um endereço padrão (nesse caso, vazio)
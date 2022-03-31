package estudos.alura.modelo

//Como um cliente não é um funcionário, ele pode
//autenticar através da Interface Autenticavel

class Cliente(
    val nome: String,
    private val senha: Int
): estudos.alura.modelo.Autenticavel {
    override fun autentica(senha: Int): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}

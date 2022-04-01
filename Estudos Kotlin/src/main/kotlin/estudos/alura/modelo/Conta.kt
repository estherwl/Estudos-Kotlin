package estudos.alura.modelo

//construtor pode ter valores padrão, ex: class Conta(val titular: String="esther", val numero: Int)
//ou seja, ao criar o objeto se não declarar outro valor, terá o valor padrão
abstract class Conta(val titular: Cliente,
                     val numero: Int,
){
    var saldo = 0.0
        protected set
    //saldo só pode ser modificado através da classe, já que set é protected

    //object declaration(declara singletons) -> para usar dentro da classe usa keyword companion
    // faz com que mantenhamos um valor que seja considerado como estático, porque ele não
    // muda o valor desde o começo do programa até o fim, sendo membro da
    // classe e apenas ela consegue fazer a sua manipulação
    companion object Contador{
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(conta: estudos.alura.modelo.Conta, valor: Double){
        if(valor > 0) conta.saldo += valor
    }

    @Throws(Exception::class)
    abstract fun saca(valor: Double)
}
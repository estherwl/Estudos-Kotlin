package estudos.alura.modelo

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: estudos.alura.modelo.Funcionario){
        this.total += funcionario.bonificacao
    }
}
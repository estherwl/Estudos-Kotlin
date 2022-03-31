package estudos.alura.modelo

//analista tem comportamento de Funcionário, enquanto outros cargos
//possuem comportamento de FuncionarioAdmin, por isso as duas classes
//são abstratas, com FuncionarioAdmin herdando de Funcionario os comportamentos em comum
//e implementando seus próprios

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : estudos.alura.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            return salario
        }
}

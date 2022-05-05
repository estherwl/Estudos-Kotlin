package estudos.funcionalidades

fun main() {
    val banco = BancoDeNomes()

    banco.salva("Alex")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

//companion object - mantem os dados, pois se fosse uma simples variavel reiniciaria com cada objeto
//foi criado Uma coleção mutável interna e uma imutável pública a fim de manter o comportamento de
//encapsulamento da POO, assim não é possivel fazer banco.nomes.add("Alex"), por exemplo
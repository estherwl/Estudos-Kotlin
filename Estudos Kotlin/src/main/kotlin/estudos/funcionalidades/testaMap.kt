package estudos.funcionalidades

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    val pedido = pedidos[3]
    //tratamento de nulo
    pedido?.let {
        println("pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos){
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 50.0)
    println(pedidos)
}

//Map: conjunto de chave e valor (valores únicos)
//Uma das formas de criar um map é com o método infix (to), porem
//é uma forma menos performática

//putIfAbsent() adiciona elementos apenas quando a chave não existir.
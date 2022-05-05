package estudos.funcionalidades

fun main() {
    val salarios = arrayOf<Int>(3, 3500, 2500, 8000)

    val media = salarios
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .average()

    val mediaMenoresSalarios = salarios
        .sorted()
        .take(2)
        .toTypedArray()
        .average()
}

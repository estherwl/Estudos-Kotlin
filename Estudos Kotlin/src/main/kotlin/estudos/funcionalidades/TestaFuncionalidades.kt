fun main(args: Array<String>) {
    testaIncremento()
    testaFor()
    testaArray()
    testaHighOrderFunction()
}

fun testaIncremento(){
    var num = 2
    println(num++)
    println(num)
    var num3 = 2
    println(++num3)
}
fun testaFor(){
    val contacts = arrayOf("John", "James", "Amy")
    contacts[1] = "Dave"
    for (name in contacts) println(name)
    for (i in 1..5) {
        println(i)
    }
    for (i in 1 until 5) {print(i)}
    for (x in 1..10 step 2) {
        print(x)
    }
}
fun testaArray(){
    val arr = arrayOf(1, 2, 3, 4, 5)
    print(arr.filter { it % 2 == 0 })
    arr.forEach { num -> println(num * 2) }
}
fun testaHighOrderFunction(){
    fun apply(x:Int, action: (Int) -> Int): Int {
        return action(x)
    }
    println(apply(4, {x -> x * 2}))
}
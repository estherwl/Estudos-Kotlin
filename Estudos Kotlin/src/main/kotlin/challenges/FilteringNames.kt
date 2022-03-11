package challenges

/* You are given an array of names and need to output only the names that start with the given letter.
The letter should be taken from user input.
Each of the resulting names should be output on a separate line. */

fun main(args: Array<String>) {
    var letter = readLine()!![0]
    val names = arrayOf("John", "David", "Amy", "James", "Amanda", "Dave", "Bob", "Billy", "Bobby", "Diana", "Lenny", "Gina")

    for(name in names) {
        if(name[0] == letter) {
            println(name)
        }
    }
}
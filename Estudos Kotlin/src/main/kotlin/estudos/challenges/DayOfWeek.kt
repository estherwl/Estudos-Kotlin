package estudos.challenges

/* The given program declares an array of weekday names.
You need to take a number as input and output the name of the day at that index.
In case the input is out of the range, output "Invalid day". */

fun main(args: Array<String>) {
    val names = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    var day = readLine()!!.toInt()

    val result = when (day) {
        0 -> "Sunday"
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Invalid day"
    }

    println(result)
}
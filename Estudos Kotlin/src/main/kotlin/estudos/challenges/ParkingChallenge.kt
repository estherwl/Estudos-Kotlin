package estudos.challenges

/* You are making a car parking software that needs to calculate and output the amount due
based on the number of hours the car was parked.
The fee is calculated based on the following price structure:
- the first 5 hours are billed at $1 per hour.
- after that, each hour is billed at $0.5 per hour.
- for each 24 hours, there is a flat fee of $15. */

fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0

    if(hours >= 24){
        total = ((hours%24)*0.5) + (15 * (hours/24))
    } else if(hours <= 5) {
        total += hours
    } else if(hours in 6 until 24){
        total += (hours - 5) * 0.5 + 5
    }

    print(total)

//    total = when{
//        hours in 1..5 -> hours*1.0
//        hours in 6..23 -> ((hours-5)*0.5)+5
//        hours>=24 -> ((hours%24)*0.5) + (15 * (hours/24))
//        else -> 0.0
//    }
//    println(total)
}
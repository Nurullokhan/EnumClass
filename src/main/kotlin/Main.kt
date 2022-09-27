fun main(args: Array<String>) {

    val days = DAYS.MONDAY

    println(days.ordinal) //This is for index
    println(days.name)    //This is for name
    println(days)         //It's also for the name

    println("*****************")

    val values = DAYS.values()
    for (value in values) {
        println(value)
    }

    println("*****************")

    val findValue = DAYS.valueOf("MONDAY")
    println(findValue)

    println("*****************")

    val customIndex = DAYS.MONDAY.index
    println(customIndex)
}
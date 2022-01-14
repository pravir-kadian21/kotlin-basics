fun main() {
    val str = "May the force be with you."

    val isEqual = str.contentEquals("May the force be with you.")
    println(isEqual)

    val rawStr = """|what would i do 
        |without your small
        |mind
        |ha ha ha ha.
    """.trimMargin()

    println(rawStr)

    val contains = str.contains("force",true)//true so that it ignores uppercase
    println(contains)

    val upper = str.uppercase()
    val lower = str.lowercase()

    println(upper)
    println(lower)

    val subSequence = str.subSequence(4,13)
    println(subSequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $lightSaberColor lightSaber and drives a $vehicle and is $age years old")
    println("Lukes full name is $luke and is ${luke.length} characters")
}
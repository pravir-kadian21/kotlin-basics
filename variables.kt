import kotlin.reflect.typeOf

fun main() {
    val name = "randomName"//immutable variable
    var isAwesome = true // mutable variable

    println("Is " + name + " awesome?" + " Ans is " + isAwesome)

    isAwesome  = false
    println("Is " + name + " awesome?" + " Ans is " + isAwesome)

    var a = 10//int
    val b = 20//int

    println(a+b)

    val num1 = 123.45//double
    val num2 = 123.45//double

    println(num1+num2)

    val fNum1 = 123.45f//float
    val fNum2 = 123.45f//float

    println(fNum1+fNum2)

    val numL = 123456789L //long
    println(numL)

    var aString = a.toString(a)
    println(aString)

    val hero:String//declaration
    hero = "Ironman"//initialisation
    println(hero)

}
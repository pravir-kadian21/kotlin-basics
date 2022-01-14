fun main() {
    var a = 2
    var b = 2
    if(a==b){
        println("a and b are equal")
    }
    b = 3
    if(a!=b){
        println("a and b are not equal")
    }

    val accountBalance = 100
    val price = 50

    if(accountBalance>=price){
        println("You can buy this")
    }
    else{
        println("Sorry you are broke!!")
    }

    val tempDegree = 70

    if(tempDegree>=70){
        println("This is a nice weather")
    }
    else if(tempDegree<70 && tempDegree>=50){
        println("Grab a sweater")
    }
    else{
        println("Holy Crap its cold")
    }

    val isHungry = false
    val isBored = true

    if(isHungry || isBored){
        println("Lets get Pizza")
    }

    val x = 4

    when(x){//like switch
        1 -> println("x is 1")
        2-> println("x is 2")
        3 -> println("x is 3")
        else -> println("Its like default in switch")
    }
}
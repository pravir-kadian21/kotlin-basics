
class Car(val make: String, val model: String, var color: String){
    fun accelerate(){
        println("Car accelerated")
    }
    fun details(){
        println("This is a $color $make $model")
    }
}

class Truck(val make:String, val model: String, val towingCapacity:Int){
    fun tow(){
        println("Taking the horses to the rodeo")
    }

    fun details(){
        println("This $make $model has a towing capacity of $towingCapacity pounds")
    }
}


fun main() {
    val car = Car("Toyota","Liva","Red")
    println(car.make)
    println(car.model)
    car.accelerate()
    car.details()

    val truck = Truck("Ford","F150",10000)
    truck.tow()
    truck.details()
}
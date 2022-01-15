
open class Vehicle(val make:String,val model: String){
    open fun accelerate(){
        println("Car Accelerated")
    }
    fun park(){
        println("Parking the vehicle")
    }
    fun brake(){
        println("STOP")
    }
}

class Car1( make: String, model: String, var color:String) : Vehicle(make, model) {
    override fun accelerate(){
        println("Silent acceleration...... it's Tesla")
    }
}

class Truck1(make:String,model:String,var towingCapacity: Int) : Vehicle(make,model){

}

fun main() {
    val tesla = Car1("tesla","model-s","Red")
    tesla.accelerate()

    val truck = Truck1("ford","F140",1000)
    truck.brake()
}
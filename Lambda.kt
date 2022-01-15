fun main() {
    val printMessage = {message: String -> println(message)}

    printMessage("Hello World")

    val sumA = {x:Int, y:Int -> x+y}
    println(sumA(2,3))

    val sumB : (Int,Int) -> Int = {x,y -> x+y}
    println(sumB(3,4))

    fun downloadData(url:String,completion : ()-> Unit){
        //sent a download request
        //we got back data
        //there were no network error
         completion()
    }

    downloadData("fakeUrl.com") {
        println("The code in this block will only run after completion()")
    }

    fun downloadCarData(url:String,completion: (Car)->Unit){
        val car = Car("Tesla","ModelX","Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com"){ car ->
        println(car.make)
        println(car.model)
        println(car.color)
    }

    fun downloadTruckData(url:String,completion:(Truck?,Boolean) -> Unit){
        val webRequest = true
        if(webRequest){
            val truck = Truck("Ford","F150",10000)
            completion(truck,true)
        }
        else{
            completion(null,false)
        }
    }
    downloadTruckData("fakeUrl.com"){ truck,success ->
        if(success){
            truck?.tow()
        }
        else{
            println("Something went wrong")
        }
    }

}
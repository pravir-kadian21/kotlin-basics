fun main() {
    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")

    val rebelVehicles = hashMapOf("Solo" to "Millennium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    for(rebel in rebels){
        println("Name: $rebel")
    }

    for((key,value) in rebelVehicles){
        println("$key :: $value")
    }

    var x = 10
    while(x>0){
        println(x)
        x--
    }
}
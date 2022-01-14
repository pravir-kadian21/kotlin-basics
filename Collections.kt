fun main() {

    //LISTS

    val imperials = listOf("Emperor","Darth Vader","Boba Fett","Tarkin")//immutable list
    println(imperials)
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Luke"))

    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")//mutable lists
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0,"Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)


    //MAPS
    val rebelVehiclesMap = mapOf("Solo" to "Millennium Falcon", "Luke" to "Landspeeder")//key to value    immutable maps
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Liah", "This ship dosn't exist"))
    println(rebelVehiclesMap.values)


    val rebelVehicles = hashMapOf("Solo" to "Millennium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")//mutable map
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah","Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)

}
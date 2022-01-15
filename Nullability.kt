fun main() {
    var nullableName : String? = "Do I really exist?"

    var length = 0
    if(nullableName == null){
        length = -1
    }
    else{
        length = nullableName.length
    }
    println(length)

    nullableName = null

    if(nullableName == null){
        length = -1
    }
    else{
        length = nullableName.length
    }

    println(length)

    //other way

    var l = if(nullableName!=null)  nullableName.length else -1

    println(l)

    //another way using safe call operator
    println(nullableName?.length)//prints null if nullableName is null otherwise length of nullableName

    //another way is using Elvis operator
    var len = nullableName?.length ?: -1 //len is nullableName.length if its not null otherwise its -1
    println(len)

    var name = nullableName ?: "No one knows me...."
    println(name)


}
fun main() {
    checkName("Cynthia")
    inputStr(arrayOf("John","Cynthia", "Mary","Terry"))
    println(threeNames("Jackline","Susan", "Mary"))
}

fun checkName(name:String){
    if (name=="Akinyi"){
        println("Thats me!")}
    else{
        println("I dont know who that is")
    }
}

fun inputStr(text:Array<String>) {
 println(text.contentToString())
}
fun threeNames(firstName: String, secondName: String, thirdName: String): String {
    var name:Array<String> =arrayOf(firstName,secondName,thirdName)
    return name.contentToString()
}
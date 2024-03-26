fun main() {
    printNationality("Tanzania")
    nationality("Tanzania")
    nationality("Uganda")
    nationality("Kenya")
    printNationalityWhen("South Africa")
    printNationalityWhen("southSudanese")
    selectContainer(1)
    printRangeSquares(5, 7)
    printRangeSquares(9, 17)
// looping through arrays
    val languages = arrayOf("Kiswahili", "Luganda", "KInyarwanda", "Somali")
    for (language in languages) {
        println(language)
    }
//looping in a string
    val group = "Lovelace"
    for (letter in group) {
        println(letter)
    }

//    looping in ranges
    for (num in 1..100) {
        println(num * num)
    }


//while loop
    var num = 12
    while (num > 0) {
        println(num)
        num--
    }
//    dowhile
    do{
        println(num)
        num--
    }
    while(num>0)
//    Using If
    for (num in 1..100){
        val square = num*num
        if(square<1000){
            println(square)
        }
    }
//    if else



}
//Binary conditions
fun printNationality(country:String){
    if(country=="Tanzania"){
        println("Tanzanian")
    }
    else{
        println("Foreigner")
    }

}
///    More than 2 conditions
fun nationality(country: String){
    if(country=="Tanzania"){
        println("Tanzanian")
    }
    else if(country=="Uganda"){
        println("Ugandan")
    }
    else{
        println("Foreigner")
    }

}

////Nested if
//fun schoolAssignment(marks:Int){
//    if (marks>390){
//        println("provincial")
//    }
//    else if(marks in 350>389){
//        println("Provincial")
//    }
//    else{
//        println("provincial")
//    }
//}
fun marriage(){
    val married=true
    if (married){
        println("Mrs")
    }
    else{
        println("Foreigner")
    }
}
//when(replaces else if
fun printNationalityWhen(country: String){
    when (country){
        "Tanzania" -> println("Tanzanian")
        "Uganda"  -> println("Ugandan")
        "Malawi"-> println("Malawian")
        "southSudanese" -> println("southSudanese")
        else -> println("Foreigner")
    }
}
//Using when to combine conditions separated by commas
fun selectContainer(litres:Int){
    when(litres){
        1,2,3 -> println("bottle")
        4,5,5,7 -> println("bucket")
        8,9 -> println("big bucket")
        else -> println("jerrycan")
    }
}
//fun calculate(x:Int,y:Int,sign:String):Int {
//    var result = 0
//    when (sign) {
//        "+" -> {
//            result = x + y
//        }
//
//        "*" -> {
//            result = x * y
//
//        }
//
//
//    }
//}


fun printRangeSquares(start:Int,end:Int){
    for (num in start..end)
        println(num)
}
//

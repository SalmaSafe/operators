fun main() {
    state("Salma")
    modulus(10, 4)
    sum(10, 40, 5, 2)
    interesting("a manly voice")
}
fun state(name:String){
    println("Hello "+name)
}
fun modulus(a:Int, b:Int){
    var division =a/b
    println(division)
}
fun sum(a:Int, b:Int, c:Int, d:Int){
    var sum= a+b+c+d
    println(sum)

}
fun interesting(statement :String){
    println("I got "+ statement)
}
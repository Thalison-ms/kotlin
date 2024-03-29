fun printMessage(message: String){
    println(message)
}
fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}
fun sum(x: Int, y: Int): Int{
    return x + y
}
fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello!")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Jurema", message = "Faz café")
    println(sum(4, 10))
    println(multiply(10, 10))
}

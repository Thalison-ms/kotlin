fun someCondition() = false

fun main() {
    var a: String = "Initial"		//Mutável, pode mudar a qualquer momento
    println(a)
    
    val b: Int = 1					//val é não mutável, não é possível reatribuir valores
    val c = 3						//Inferência nativa do Kotlin, não sendo necessário ficar tipando toda hora
    println(b)
    println(c)
    
    a = "Final"
    println(a)
    
    val d: Int
    //println(d)					//Força um erro quando variável não é inicializada
    if(someCondition()){			//Garante uma unicialização pra variável
        d = 1
    } else {
        d = 2
    }
    println(d)
}

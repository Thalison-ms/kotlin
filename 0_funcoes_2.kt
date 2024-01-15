fun main(){
  //A funcionalidade vararg possibilita informar uma quantidade indefinida de informações na passagem do parâmetro, desde que atenda o tipo
  fun printAll(vararg messages: String){
      for (m in messages) println(m)
  }
  printAll("Hello", "Hallo", "Salut", "Hola", "Japones")
  
  fun printAllWithPrefix(vararg messages: String, prefix: String){
      for (m in messages) println(prefix + m)
  }
  printAllWithPrefix(
      "Alberto", "Carlos", "Fernando", "Jaime", "Tupa",
      prefix = "Usuario: "
  )
  
  fun log(vararg entries: String){
      printAll(*entries)//Indica que deseja passar um vararg e não um array, o que pode ocasionar erro
  }
  log("1", "2", "3", "4", "5")
}

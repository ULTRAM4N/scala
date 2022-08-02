package scalaRocktheJVM

object Basics extends App {
  
  val meaningOfLife : Int = 42
  // if expressions
  val ifExpression = if(meaningOfLife > 40) 45 else 50
  println(ifExpression)
  
  // chained if expression
  
  val ifExpressions = if(meaningOfLife > 340) 56
  else if (meaningOfLife < 50) 30
  else if (meaningOfLife < 30 ) 0
  else 1200
  println(ifExpressions)
  // aCodeBlock
  
  val aCodeBlock = {
    val sum = 5767
    sum+87
  }
  println(aCodeBlock)
  
  /**
   * In scala, we don't use for loops, we use recursion  
   */
  
  // recursive Functions
  
  def factorial(n : Int) : Int = {
    if(n == 1) 1    // if block always will be our base case and else block will be our execution 
    else{
      n * factorial(n-1)
    }
  }
  
  println(factorial(5))
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
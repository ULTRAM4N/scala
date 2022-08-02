package DSA.recursion

object factorial extends App {

  val n = scala.io.StdIn.readInt()

  println(factorial(n))
  def factorial (n : Int) : Int = {

    if(n == 1) 1
    else n * factorial(n-1)

  }


}

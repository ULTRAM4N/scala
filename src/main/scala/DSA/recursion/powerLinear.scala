package DSA.recursion

object powerLinear extends App {

  val x = 2 //scala.io.StdIn.readInt()
  val n = 5 //scala.io.StdIn.readInt().toDouble
  println(getPower(x,n))

  def getPower(x :Int, n : Double) : Int = {

    if(n == 0) 1
    else x * getPower(x,n-1)
  }

}

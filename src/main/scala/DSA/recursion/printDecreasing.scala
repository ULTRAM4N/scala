package DSA.recursion

object printDecreasing extends App {

  val n = scala.io.StdIn.readInt()

  printDecreasing(n)

  def printDecreasing(n : Int) : Unit = {

  if(n == 0) return
    else{
    println(n)
    printDecreasing(n-1)
  }

  }

}

package DSA.recursion

object printIncreasingDecreasing extends App {

  val n = scala.io.StdIn.readInt()

  printIncreasingDecreasing(n)

  def printIncreasingDecreasing(n : Int) : Unit = {
      if(n == 0) return
    println(n)
    printIncreasingDecreasing(n-1)
    println(n)
  }

}

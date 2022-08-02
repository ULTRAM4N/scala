package DSA.recursion

object printIncreasing extends App {

  val n = scala.io.StdIn.readInt()
  printIncreasing(n)

  def printIncreasing(n : Int) : Unit = {
    if(n == 0) return
    printIncreasing(n-1);   // 1
    println(n)              // 2
  }


}

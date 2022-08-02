package functionalProgramming

object chapter_1 extends App {

  // class and instance
  class Animal {
    val age = 0;

    // method
    def eat() {
      println(s"I m eating !")
    }
  }

  val anAnimal = new Animal

  //inheritance --> means inheriting all the data members of super class

  //cat(name: String) is a constructor definiton it is not same as an argument , to make it as an argument
  // put val before the constructor argument
  class cat(name: String) extends Animal {
    override def eat() = {
      println("Cat method is called!")
    }
  }

  val aCat = new cat("Kitty")

  // subtype polymorphism

  val aDeclaredAnimal: Animal = new cat("Sutti")
  aDeclaredAnimal.eat()

  /* at compile time , it will pick eat method from Animal class but at runtime it will pick eat
 * method from cat class if that method is overridden (means the method has been changed)
 * then it will pick that method otherwise it will pick the superClass method
*/

  // abstract class
  abstract class walkingAnimal {
    protected val hasLegs = true
    def walk(): Unit
  }

  class letsWalkTommy extends walkingAnimal {
    override val hasLegs = false
    def walk(): Unit = {
      println("Let's go to walk Tommy")
    }
  }

  val tommy = new letsWalkTommy
  println(tommy.hasLegs)

  // Interface --> Ultimate abstract type
 
  trait Carnivore {
    def eat(animal: Animal): Unit
  }
  
  trait Omnivore {
    def eatFlesh(animal : Animal) : Unit
  }
  
  class Crocodile extends Animal with Carnivore with Omnivore {
    override def eat(animal : Animal) : Unit ={ println("Hi, I m carnivorous")}
    override def eatFlesh(animal:Animal) : Unit = {println("Hi, I am an Omnivoruos")}
  }
  
  val croc = new Crocodile
  croc.eat(aCat)
  croc eat aCat  // infix notation , only available for methods having one argument
  croc.eatFlesh(anAnimal)
  
  // anonymous class
  val acrod = new Carnivore {
    override def eat(animal : Animal) : Unit = {println(s"This is acrod")}
  }
  
  
  
  
  
}
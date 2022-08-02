package scalaRocktheJVM.OOPs

object abstractClass extends App {


  abstract class student{
    var name :String
    var age :Int

    def studentDetails() : Unit

  }


  class students extends student {
    override var name : String = _
    override  var age : Int = _
    override def studentDetails() ={
      println(s"The name and the age of student are $name and $age")
    }
  }


  val st = new students
  st.name = "Rajeev"
  st.age  = 25
  st.studentDetails()

}

//class with campanion object using scala
//Companion object can be used to provide factory methods and utility function related to a class.

//A companian object will have same name as of class trait name
// same scope it resides within same file;
// access to private members of the class or trait
//This can accessed directly using class name without any instance of class

class Circle(val radius: Double){
  def area: Double = Math.PI * radius * radius
  def circumference: Double = 2 * Math.PI * radius
}

object circle {
  def apply(radius: Double): Circle = new Circle(radius)
}
object CompanionObj extends App{
  //Create an instance using companion object
  var circle = Circle(6.0)
  println(circle.area)
  println(circle.circumference)
}

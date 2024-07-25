//Inheritance - Example demonstrate inheritance
//Where a subclass (child class) extends a superclass (Parent Class)

class Animal (val name: String){
  def makeSound(): Unit = {
    println(s"$name is making a sound")
  }
}

//subclass
class Dog(name: String) extends Animal(name){
  override def makeSound(): Unit = {
    print(s"$name says woof!..")
  }
}

object Inheriobj extends App{
  val animal = new Animal("Generic Name")
  animal.makeSound()

  val dog = new Dog("Charlie")
  dog.makeSound()
}
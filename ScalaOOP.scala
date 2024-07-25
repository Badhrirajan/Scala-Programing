//Define a class
class Car(val make: String,var model: String,var year: Int){
  def displayInfo() : Unit = {
    println(s"Car Info : $year $make $model")
  }
}

//Create an Object of class car
object SimpleClass extends App{
  val car = new Car("Toyota","corolla",2019)

  //Call method using car object
  car.displayInfo()

  //modify values of class
  car.year = 2020
  car.model = "Fortuner"
  car.displayInfo()
}

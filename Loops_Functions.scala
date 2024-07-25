object Loops_Functions{
  def main(args: Array[String]): Unit = {

    /*do-while loop new syntax - version 3.3.3
    var j = 1

    while
      println(j)
      j += 1
      j <=5
    do()
  */

    //for loop with Range And step size = 2
    for(i <- 1 to 10 by 2){
      println(i)
    }

    //Itreating over a collection
    val fruits = List("apples","cherry","oranges","pineapple","strawberry")
    for (fruit <- fruits){
      println(fruit)
    }

    //Complex condition
    import scala.io.StdIn
    print("Enter the temperature : ")
    val temperature = StdIn.readInt()
    print("Enter the humidity: ")
    val humidity = StdIn.readInt()

    val weatherDesc = if(temperature > 30 & humidity > 60) {
      println("Hot & Humid")
    } else if (temperature > 30){
      println("Hot")
    } else if (humidity > 70){
      println("Humid")
  } else {
      println("Pleasant")
    }

  //Functions in Scala Programming

  def add(a: Int,b: Int) : Int = {
    a + b
  }

   //anonymos  functions like lamda
   val summation = (a: Int, b: Int) => a + b
    println(summation(5,6))

    //Problem 1. Find the maximum element in a lisdt
    def findMax (lst: List[Int]): Int = {
      lst.max
    }
    val numbers = List(1,3,5,2,4,7,9)
    val maximum = findMax(numbers)
    println(maximum)

    //Problem 2: Factorial of a num
    def fact(num: Int): Int = {
      if (num == 0) 1
      else num * fact(num-1)
    }
    val factValue = fact(6)
    println(factValue)
  }
}

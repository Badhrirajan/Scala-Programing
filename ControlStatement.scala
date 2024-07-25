object ControlStatement{
  def main(args: Array[String]): Unit = {
    //Example1: if-else
    /*
    import scala.io.StdIn
    println("Enter a Number : ")

    //Ask user to input and typecast it to a Interger Datatype
    val x1 = StdIn.readLine().toInt

    if (x1 > 0) {
      print("Value is positive")
    }
    else if (x1 < 0){
      println("Value is negative")
    }
    else {
      println("Value is Zero")
    }

    //Example2: Using if-else as a expression
    println("Enter the number : ")
    val x2 = StdIn.readLine().toInt
    val output = if(x2 % 2 == 0) "even" else "odd"
    println(output)

    //Example3: While loop using scala
    var i = 1
    while (i <= 5){
      println(s"Value of i is : $i")
      i += 1
    }
    //Example 4: For Loop in Scala
    val List_1 = List("Kerala","UST1001",22,"CSE",78.898)
    for (value <- List_1){
      println(value)
    }
    //Example 5. Generate a collection of even numbers
    val numbers = (1 to 50).toList
    //yield is keyword in scala to generate new collection from an existing
    val even = for {
      num <- numbers
      if num % 2 == 0
    } yield num
    println(even)
  } */

    //Example 6. Generate a prime number
    val primes = for{
      num <- 2 to 100
      if(2 until num).forall(x => num % x != 0)
    } yield num

    println(primes.mkString((",")))
    
    }
  }

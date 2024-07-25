//Case Class are special classes in scala that are immutable and are compared by value
//They are ideal for use in pattern matching

case class Person(name: String, salary: Int)
  object CaseClass extends App {
    //Create an instance of case class
    var person1 = Person("Person1", 3000)
    var person2 = Person("Person2", 5000)

    //Print the person details
    println(person1)
    println(person2)

    //Copy Case Class
    var person3 = person1.copy(salary = 2500)
    println(person3)

    //Pattern matching with case class
    //Pattern matching in scala allows you to match values against pattern and
    //Execute code based on the match.
    person1 match {
      //case pattern1 => result1
      case Person(name, salary) => println(s"Name: $name, Salary: $salary")
    }
  }

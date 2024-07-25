object Task5{
  def main(args: Array[String]): Unit = {
    //Create a partition of employee with > 10% of overall salary
    //and less than 10% of overall salary

    val Employee = List((1,"HR",5000000),(2,"Manager",1000000),(3,"TeamLead",750000),(4,"Developer",400000),(5,"Intern",100000))

    val Overallsalary = Employee.map(_._3).sum
    println(s"Overall Salary : $Overallsalary")

    val (highsalary,lowsalary) = Employee.partition(emp => emp._3 > 0.1*Overallsalary)

    println("Highest Salary > 10%")
    highsalary.foreach(println)

    println("Lowest Salary < 10%")
    lowsalary.foreach(println)
  }
}
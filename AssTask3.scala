object AssTask3 {
  class Employee(val name: String)
  case class FullTimeEmployee(override val name: String, salary: Double) extends
    Employee(name)
  case class PartTimeEmployee(override val name: String, hoursWorked: Int, rate:
  Double) extends Employee(name)
  case class ContractEmployee(override val name: String, hoursWorked: Int, rate:
  Double) extends Employee(name)
  case class Freelancer(override val name: String, hoursWorked: Int, rate: Double)
    extends Employee(name)
  def calculateSalary(employee: Employee): Double = employee match {
    case FullTimeEmployee(_, salary) => salary
    case PartTimeEmployee(_, hoursWorked, rate) => hoursWorked * rate
    case ContractEmployee(_, hoursWorked, rate) => hoursWorked * rate
    case Freelancer(_, hoursWorked, rate) => hoursWorked * rate
  }
  def main(args: Array[String]): Unit = {
    val employees = List(
      FullTimeEmployee("Rohit Sharma", 100000),
      PartTimeEmployee("Virat Kohli", 40, 25.0),
      ContractEmployee("Shivam Dube", 30, 20.0),
      Freelancer("Jasprit Bumrah", 45, 20.0)
    )
    employees.foreach { employee =>
      val salary = calculateSalary(employee)
      println(s"The salary of ${employee.name} is $salary")
    }
  }
}
object atm_machine{
  import scala.io.StdIn

  def main(args: Array[String]): Unit = {
    val x: Int = 2000
    val y: Int = 500
    val z: Int = 100
    val xx: Int = 50
    val yy: Int = 20
    val zz: Int = 10
    val xyz: Int = 5

    println("----------------Each currencies----------------")
    println("Enter number of 2000 currencies: ")
    val a: Int = StdIn.readInt()
    println("Enter number of 500 currencies: ")
    val b: Int = StdIn.readInt()
    println("Enter number of 100 currencies: ")
    val c: Int = StdIn.readInt()
    println("Enter number of 50 currencies: ")
    val d: Int = StdIn.readInt()
    println("Enter number of 20 currencies: ")
    val e: Int = StdIn.readInt()
    println("Enter number of 10 currencies: ")
    val f: Int = StdIn.readInt()
    println("Enter number of 5 currencies: ")
    val g: Int = StdIn.readInt()

    var atm_amount = (a*x) + (b*y) + (c*z) + (d*xx) + (e*yy) + (f*zz) + (g*xyz)
    println(f"Total Amount in ATM is : $atm_amount")

    println("Enter the amount you want to withdraw : ")
    var user_amount: Int = StdIn.readInt()
    if (user_amount > atm_amount){
        println("Insuffiecent Balance in the ATM")
      }
    else{
    }
  }
}
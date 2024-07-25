object Task3{

  import scala.io.StdIn
  println("Enter Bank Details")
  println("Enter User Name")
  val UserName = StdIn.readLine()
  println("Enter Your Account Number")
  val AccountNumber = StdIn.readInt()
  var Amount: Int = 200

  def bankingMenu(): Unit = {
    //Create Banking Balance
    //1.Check Balance,2.Withdraw,3.Deposit,4.Exit

    var continue = true

    println("Please select the choice from menu" +
      "1.Check Balance" +
      "2.Deposit" +
      "3.Withdraw" +
      "4.Exit")

    while (continue) {
      println("Enter the choice : ")
      var user_input = StdIn.readInt()
      if (user_input == 1) {
        CheckBalance()
      }
      else if (user_input == 2) {
        DepositAmount()
      }
      else if (user_input == 3) {
        WithdrawAmount()
      }
      else if (user_input == 4) {
        ExitMenu()
        continue = false
      }
      else {
        println("Invalid Choice")
      }
    }

    def CheckBalance(): Unit = {
      println(s"Balance in the Account is : $Amount")
    }

    def DepositAmount(): Unit = {
      println("Enter the Amount You want to Deposit")
      var userAmount = StdIn.readInt()
      if (userAmount < 0) {
        println("Only positive value are accepted")
      }
      else {
        Amount += userAmount
        println(s"Total Amount in the Account is : $Amount")
      }
    }

    def WithdrawAmount(): Unit = {
      println("Enter the amount you want to withdraw")
      var withdrawAmt = StdIn.readInt()
      if (withdrawAmt > Amount) {
        println("Insufficient Balance")
      }
      else {
        Amount -= withdrawAmt
        println(s"Current Bank Balance After Withdraw is : $Amount")
      }
    }

    def ExitMenu(): Unit = {
      println("Thanks for Visiting the Bank")
    }
  }
  def main(args: Array[String]): Unit = {
    bankingMenu()
  }
}

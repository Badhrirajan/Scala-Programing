class Account(val accountNum: String,var balance: Double){
  def deposit(amount: Double): Unit = {
    if (amount > 0){
      balance += amount
    }
  }
  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance){
      balance -= amount
      println(s"Withdraw $amount, new balance: $balance")
    } else{
      println("Insufficient Funds or Invalid Amount")
    }
  }
  def getBalance:Double = balance
}

object BankingApp {
  def main(args: Array[String]): Unit = {
    //Create and instances of Account
    val account1 = new Account("UST12345",1000.0)
    val account2 = new Account("UST0777",2030.0)
    println(s"Account Number: ${account1.accountNum}, Initial Balance: ${account1.balance}")

    account1.deposit(1500.0)
    account1.withdraw(2000.0)
    println(s"Final balance : ${account1.getBalance}")
  }
}

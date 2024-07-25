object AssTask1 {

  import scala.util.Random
  import scala.io.StdIn
  def generate_password(pas_length: Int): String = {
    val alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
    val numbers = "0123456789"
    val special_character = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~\\"

    val allCharacter = alphabets + numbers + special_character
    val random = new Random()

    (1 to pas_length).map { _ =>
      allCharacter(random.nextInt(allCharacter.length))
    }.mkString
  }
  def main(args: Array[String]): Unit = {
    println("Enter the password length:")
    val pas_length = StdIn.readInt()

    val password = generate_password(pas_length)
    println(s"Generated Password is : $password")
  }
}

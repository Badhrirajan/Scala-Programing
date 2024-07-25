object Task2{
  def main(args: Array[String]): Unit = {

    //Task: GroupBy the Words Starting with Vowels
    val arrayString = Array("sky", "apple", "eat", "try", "scala", "icecream", "Aeroplane")
    val vowels = List('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
    val groupByVowels = arrayString.groupBy(word => if (vowels.contains(word.charAt(0))) "Vowels" else "consonants")
    groupByVowels.foreach {
      case (key, value) => println(s"$key: ${value.mkString(", ")}")
    }
  }
}

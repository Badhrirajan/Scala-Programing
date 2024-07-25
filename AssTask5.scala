
import scala.io.Source
import scala.collection.mutable


class Analyzer(filePath: String) {
  private val lines = Source.fromFile(filePath).getLines().toList
  private val words = lines.flatMap(_.toLowerCase.split("\\W+").filter(_.nonEmpty))
  private val wordCounts = mutable.Map[String, Int]().withDefaultValue(0)
  words.foreach(word => wordCounts(word) += 1)


  def wordCount(): Int = words.size


  def lineCount(): Int = lines.size


  def characterCount(): Int = lines.mkString("").length


  def averageWordLength(): Double = if (words.isEmpty) 0.0 else words.map(_.length).sum.toDouble / words.size


  def mostCommonStartingLetter(): Option[Char] = {
    val startingLetters = words.map(_.headOption).flatten
    if (startingLetters.isEmpty) None
    else Some(startingLetters.groupBy(identity).maxBy(_._2.size)._1)
  }


  def wordOccurrences(word: String): Int = wordCounts(word.toLowerCase)


  def topNMostFrequentWords(topN: Int): List[(String, Int)] = {
    wordCounts.toList.sortBy(-_._2).take(topN)
  }
}


object AssTask5 {
  def main(args: Array[String]): Unit = {
    val filePath = "C:\\Users\\Administrator\\Downloads\\Harry_Potter.txt"


    val file_analyzer = new Analyzer(filePath)


    println(s"Total number of words: ${file_analyzer.wordCount()}")
    println(s"Total number of lines: ${file_analyzer.lineCount()}")
    println(s"Total number of characters: ${file_analyzer.characterCount()}")
    println(f"Average word length: ${file_analyzer.averageWordLength()}%.2f")
    println(s"Most common starting letter: ${file_analyzer.mostCommonStartingLetter().getOrElse("None")}")


    println("Enter a word to find its occurrences:")
    val word = scala.io.StdIn.readLine()
    println(s"Occurrences of '$word': ${file_analyzer.wordOccurrences(word)}")


    println("Enter the number of top most frequent words to display:")
    val topN = scala.io.StdIn.readInt()
    println(s"Top $topN most frequent words:")
    file_analyzer.topNMostFrequentWords(topN).foreach { case (word, count) =>
      println(s"$word: $count")
    }
  }
}

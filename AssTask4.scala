import scala.collection.MapView
import scala.io.Source
import scala.io.StdIn
object AssTask4 {
  def wordCount(filePath: String): MapView[String, Int] = {
    val source = Source.fromFile(filePath)
    val lines = source.getLines().toList
    source.close()
    val wordCounts = lines
      .flatMap(_.split("\\s+"))
      .filter(_.nonEmpty)
      .groupBy(_.toLowerCase)
      .mapValues(_.size)
    wordCounts
  }
  def topNWords(wordCounts: MapView[String, Int], topN: Int): List[(String, Int)] = {
    wordCounts.toList.sortBy(-_._2).take(topN)
  }
  def main(args: Array[String]): Unit = {
    println("Enter the file path:")
    val filePath = StdIn.readLine().trim
    println("Enter the number of top frequent words you want to see:")
    val topN = StdIn.readInt()
    val wordCounts = wordCount(filePath)
    val topWords = topNWords(wordCounts, topN)
    println(s"\nTop $topN frequent words in the file '$filePath':")
    topWords.foreach { case (word, count) =>
      println(s"$word: $count")
    }
  }
}


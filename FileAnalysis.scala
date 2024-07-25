//SingleTon Object
import scala.io.Source
object FileAnalysis{
  def main(args: Array[String]): Unit = {
    val filePath = "C:\\Users\\Administrator\\Downloads\\AK.txt"

    //Read the file from path
    val source = Source.fromFile(filePath)

    //Read All line from File
    val lines = source.getLines().toList
    source.close() //For Closing the file

    //Count Words
    val words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase)
    //words.foreach(println)

/*
    //1.Get Most frequent wordcount
    val groupedWords = words.groupBy(identity)
    val wordCount = groupedWords.mapValues(_.size).toSeq.sortBy(-_._2)
    wordCount.take(10).foreach{
      case(word,count) => println(s"$word : $count")
    }
*/

    //2.Average Word Length
    val totalWords = words.length
    //println(totalWords)
    val totalChars = words.map(_.length).sum
    //println(totalChars)
    val avgWordLength = if(totalWords > 0) totalChars.toDouble / totalWords else 0.0
    println(s"$avgWordLength")
  }
}

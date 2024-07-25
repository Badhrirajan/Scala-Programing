import scala.io.Source
object Task4{
  def main(args: Array[String]): Unit = {
    //Task1:Find States With Highest GDP Contribution
    //Task2:Find Average GDP Per Capita
    //Task3: Total GDP

    val filePath = "C:\\Users\\Administrator\\Downloads\\StateWiseGDP.csv"

    //Read the file from path
    val source = Source.fromFile(filePath)

    val lines = source.getLines().drop(1).toList
    val dataset = lines.map(line => line.split(",").toList)
    source.close()

    val highestGDP = dataset.maxBy(col => col(1).toInt)
    println(s"Highest GDP State : ${highestGDP(0)},${highestGDP(1)}")

    val totalCapita = dataset.map(col => col(2).toInt).sum
    val count = dataset.size
    val averagePerCapita = totalCapita/count
    println(s"Average Per Capita : $averagePerCapita")

    val totalGDP = dataset.map(col => col(1).toInt).sum
    println(s"Total GDP is : $totalGDP")
  }
}

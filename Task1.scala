//Task1. Processing and Filtering data
//sample record = (product_name,unit price,quantity)
//1.Filter out products that have price greater than $50
//2.Calculate total cost of each product
//3.Print name of the product that has exceeded total cost greater than $300

object Task1 {
  def main(args: Array[String]): Unit = {
    val products = List(("Apple", 90, 10), ("Mango", 110, 50), ("Banana", 30, 15), ("Orange", 40, 20))

    import scala.collection.mutable.ListBuffer
    var products1 = new ListBuffer[String]()
    var products2 = new ListBuffer[String]()

    for (items <- products) {

      val (name,price,quantity) = items

      if (price > 40) {
        products1 += s"$name"

        val totalCost = price*quantity
        println(s"Total Cost of the product $name is : $totalCost")

        if(totalCost > 400){
          products2 += s"$name : $totalCost"
        }
      }
    }

    println("Product price greater than 40 :")
    products1.foreach(println)

    println("Product price greater than 300 : ")
    products2.foreach(println)
  }
}

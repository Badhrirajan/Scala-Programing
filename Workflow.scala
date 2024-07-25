object Workflow{
  def main(args: Array[String]): Unit = {
    //1.Map Function
    //Map function transforms each element of a collection using given function
    val numbers = List(1,2,3,4,5,6,7,8)
    val num = numbers.map(_ * 2)
    val strNum = numbers.map(_ + "Number")
    //strNum.foreach(println)
    val words = List("dubai","chicago","new york","berlin","paris")
    words.map(_.length)

    //2.FlatMap
    //This function flattens multi dimension collection into a single collection
    val nestedList = List(List(1,2,3),List(4,5,6),List(7,8,9))
    //nestedList.flatMap(identity).foreach(println)

    val sentences = List("hello scala you are awesome","scala is funny")
    val words1 = sentences.flatMap(_.split(" "))

    //3.Filter: It selects elements from collection that satisfy a given condition
    val shortwords = words1.filter(_.length <= 4)

    //4.Fold: This is similar to reduce funciton starting with an initial value
    //println(numbers.fold(0)(_ + _))

    //5.Reduce: This function combines elements of collection,
    //but does not require any initial position

    val words2 = List("UST","is","best")
    val combination = words2.reduce(_+ " " +_)
    //println(combination)

    //6.Foreach - Function that applies given procedure to each element of function
    //words.foreach(word => println(word.toUpperCase))

    //7.Collect
    //The collect function applies a partial function to the elements of collection and returning new collection
    val number1= List(1,2,3,4,5,6,7,8,9,10)
    val oddNumber = number1.collect{case x if x % 2 != 0 => x}

    val wordCollection = List("Hello","am","badhrirajan","am","from","madurai","tamilnadu")
    val Largewords = wordCollection.collect{case x if x.length > 5 => x}
    println(Largewords)

    //8.Partition : This function will split collection into two parts
    //Based on predicate

    val (longwords, shortword) = words.partition(_.length > 4)

    //9.GroupBy: Groupby funciton groups the collection based on a given function
    val numbers2 = List(11,12,13,14,15,16,17,18,19)
    //println(numbers2.groupBy(_ % 2)) or numbers2.groupBy(_ % 2 == 0)

    //10.Scan: The scan funciton is similar to fold but it returns a collection of
    //successive cumulative results of binary operation
    val cumulativeSum = numbers2.scan(0)(_+_)
    println(cumulativeSum)
  }
}
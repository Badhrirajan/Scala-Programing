object DataStructures {
  def main(args: Array[String]): Unit = {
    //List : Immutable,Homogeneous collection of data
    val fruits: List[String] = List("Apple","Oranges","watermelon","grapes","guava")
    println("First Element : " + fruits.head)
    println("Value Excluding first element : " + fruits.tail)
    println("Last Elememnt : " + fruits.last)

    val List1 =  List("Hadoop","Spark","Flume","Pyspark",true,10000,3,14)
    println(List1)
    println(List1.getClass)

    //Empty list decalartion
    val emptyList: List[Nothing] = List()

    //List declaration
    val List2 = 10::20::30::40::Nil

    //Create a List Buffer of type mutable
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "Thiruvanathapuram"
    cities += ("Mumbai","Delhi","Pune")
    cities -= "Mumbai"
    println(cities)
    cities.toList //Type casting in scala is done by toDataType()

    //Array Data Type: Array is mutable, fixed size collection of data structure
    //Array is homogeneous collection
    val arrayData = Array("apple","oranges","watermelons","grapes","guava")

    //prints element by element output in new line
    //arrayData.foreach(println)
    //print all values
    println(arrayData.mkString(", "))
    arrayData(0) = "banana"
    println(arrayData.mkString(", "))

    //Declare an Empty array
    val arr_1 = new Array[String](10)
    //Declare a 2 Dim Array
    val arr_2 = Array.ofDim[Int](2,2)
    arr_2(0)(0) = 10
    arr_2(0)(1) = 20
    arr_2(1)(0) = 30
    arr_2(1)(1) = 40

    //Print the array
    var flattenArr : Array[Int] = arr_2.flatten
    println(flattenArr.mkString(","))

    //updating dimension array
    arr_2(0)(1) = 34

    //Set Collection : Immutable collection
    //Hashset - Mutable Collection of Sets
    val set_1 : Set[String] = Set()
    val set_2 = Set("apple","orange","watermelon","grapes","guava")

    import scala.collection.mutable.Set

    val mutableSet = Set("apple","orange","watermelon","grapes","guava")
      mutableSet += "blueberry"
      mutableSet -= "apple"

    //Tuple declaration
    // In scala tuple is fiexd size, can hold multiple data types
    val Tuple_1 = (10,20,30,40,50,60,70,80)
    //Tuple_1._1 = "String" = "String" update will provide error.
    println(Tuple_1._2) //Accessing individual value (2nd element)

    //Mapping in scala is collection of key-value pairs where each key is unique
    //It is similar to dictionary in python

    //import scala.collection.immutable.Map
    //import scala.collection.mutable.Map
    //Emnpty variable declaration
    var MapVar:Map[String,Int] = Map()
    var MapVar1 = Map("UST1001" -> "Sandeep","UST1002" -> "Midhun","UST1003" -> "Vinesh","UST1004" -> "Adinan")
    println(MapVar1.contains("UST1003"))
    //Access value using key
    println(MapVar1.get("UST1003"))
    //Print all keys
    println(MapVar1.keys)
    //Print all values
    println(MapVar1.values)

    //Declare mutable map data type
    import scala.collection.mutable.Map
    val mutable_Var = Map("UST1001" -> "Sandeep","UST1002" -> "Midhun","UST1003" -> "Vinesh","UST1004" -> "Adinan")
    //Update the existing value
    mutable_Var("UST1001") = "Rohit"
    //Insert a new key value pair
    mutable_Var += ("UST1005" -> "Siva")

    //Iterators in scala programming
    //An iterator in scala represent a sequence of element that allows you to traverse through a collection sequentially.
    val myList = List(20,30,40,50,60,70,80,90)
    val iter = myList.iterator
    //Methods of iterator to check if there is more elements (.hasNext()), .next() - to retrieve next Value,
    //.remove() - to remove elements from mutable iterators

    println(iter.next())
    println(iter.next())

    //Lazy initialization using scala
    lazy val donuts: Int = 100
    println(donuts * 5)

    //lazy can't be used with var
    //lazy var donuts: Int = 20

  }
}
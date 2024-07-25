object DataStructureMethods{
  def main(args: Array[String]): Unit = {

    //List & Methods

    val list_1 = List("apple","cherry","oranges","watermelon")

    //empty list
    val list2 = List()

    //Basic Operations
    val firstelement = list_1.head
    val restoflist = list_1.tail
    val lastelement = list_1.last
    val secondelement = list_1(1)
    //println(secondelement)

    //check if collection is empty
    val isListEmpty =  list_1.isEmpty
    //println(isListEmpty)

    //get size of collection
    val length = list_1.length
    //println(length)

    //Adding & removing element from list
    val list_2 = List(1,2,3,4,5,6,7,8,9,10)
    val newList = 0 :: list_2
    val appendList = list_2 :+ 11

    //concatenation between two list
    val concatList = list_2 ::: List(12,13,14,15)
    val concatList1 = list_2 ++ List(16,17,18,19,20)

    //println(concatList)

    //Removing or Dropping values from list
    //Drop function drops the value from beginning

    //println(concatList.drop(3))
    //Remove by value

    val updatedList = concatList.filter(_ != 3)
    val updatedList1 = concatList.diff(List(3,4,5))
    //println(updatedList1)

    //Transforming list
    list_2.map(_ * 3)
    list_2.filter(_ %2 == 0)
    val  nestedList = List(List(1,2,3),List(4,5,6),List(7))
    val flatList = nestedList.flatMap(identity)
    //println(flatList)

    val sum = flatList.reduce(_ + _) //Aggregate Operation
    val mul = flatList.reduce(_ * _) //Aggregation Operation
    //println(mul)

    //Slicing & Subsets of List
    list_1.take(3) //First 3 element
    list_1.takeRight(3) //Last 3 element
    list_1.dropRight(2) //Without last two element
    //println(list_1.slice(1,4)) //Start value : 1 and end value: 3

    //Converting list to map
    val listofTuples = List(("UST1001","Krishna"),("UST1002","Rohit"),("UST1003","Adinan"))
    val map = listofTuples.toMap
    //println(map)

    //Zipping list
    val zippedList = list_1.zip(list_2)
    //println(zippedList)

    val (fruits,numbers) = zippedList.unzip
    //println(fruits)

    //Sets & Sets Methods
    val set1 = Set(1,2,3,4,5,6,7,8)
    val set2 = Set("apple","cheery","oranges","watermelon","guava")

    //println(set1.contains(9)) //returns true or false
    //Adding and Removing Elements
    set1 + 9
    set1 - 7

    //Set Operations
    val SetA = Set(10,20,30,40)
    val SetB = Set(50,60,70,30,40)
    val union = SetA union SetB
    val intersection = SetA intersect SetB
    val difference = SetA diff SetB
    val subset = SetA.subsetOf(SetB)
    val mapset = SetA.map(_ * 5)
    val filterSet = SetB.filter(_ > 40)
    val reduceSet = SetA.reduce(_ + _)

    //SetA.foreach(println)

    //println(mapset)
    //println(filterSet)
    //println(reduceSet)

    //Array
    val array1 = Array("kochi","varkala","trivandrum","alappuzha")
    val array2 = Array(1,2,3,4,5,6,7,8)

    //Empty Array
    val emptyArray = Array[Int]()
    array2(0) = 10

    import scala.collection.mutable.ArrayBuffer
    //Adding elements (Arrays are fixed size , so we use ArrayBuffer)
    val arrayBuffer = ArrayBuffer(1,2,3,4,5,6,7)
    arrayBuffer += 8
    arrayBuffer -= 5
    arrayBuffer.map(_ * 2)
    val arr3 = arrayBuffer.toArray
    //println(arr3)

    val nestedArray = Array(Array(1,2,3),Array(4,5,6),Array(7,8))
    val flatArray = nestedArray.flatten

    //Slicing an Array
    flatArray.slice(1,5)
    val array4 = Array(30,40,10,20,80,60,50)
    //array4.sorted.foreach(println)
    //println(array4.reverse)

    //groupBy() method in scala collection
    var city = Array("kochi","varkala","trivandrum","alappuzha","kanyakumari","munnar")
    val groupbylen = city.groupBy(_.length)
    val groupbyFirstChar = city.groupBy(_.charAt(0))
    val groupOddEven = flatArray.groupBy(num => if(num % 2 == 0) "even" else "odd")
    //groupOddEven.foreach{
      //case(key,value) => println(s"$key: ${value.mkString(", ")}")
    //}

    //Collection - Map
    val immutableMap = Map("a" -> 1,"b" -> 2,"c" -> 3,"d" -> 4,"e" -> 5)
    import scala.collection.mutable
    val mutableMap = mutable.Map("a" -> 1,"b" -> 2,"c" -> 3,"d" -> 4,"e" -> 5)
    immutableMap.contains("a")

    //print output stored in key
    //println(immutableMap("a"))
    //println(immutableMap.size)

    //concat two maps
    val mapA = Map("a" -> 1,"b" -> 2, "c" -> 3)
    val mapB = Map("b" -> 4,"e" -> 5,"f" -> 6,"g" -> 7)
    val mergedMap = mapA ++ mapB
    //println(mergedMap)

    //Transforming Keys and Values
    val increamentValue = immutableMap.mapValues(_ + 1)
    val transformKey = immutableMap.map{
    case(key,value) => (key.toUpperCase, value)}

    increamentValue.foreach{
      case(key,value) => println(s"$key -> $value")
    }

    transformKey.foreach{
      case(key,value) => println(s"$key -> $value")
    }
  }
}

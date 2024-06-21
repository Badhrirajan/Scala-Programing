//object is a singleton isntance that is lazily intialized
//when it is first accessed it is similar class but only one instance
//instance will be created automatically

object DataTypes {
  //main is entry point to any scala application
  //unit defines the return type of main indicating that it return nothing

  def main(args: Array[String]): Unit = {
    //Integer Data Type
    val intNum: Int = 20
    val longNum: Long = 1234567890L
    val shortNum: Short = 32765
    val byteNum: Byte = 127

    //Floating DataTypes
    val FloatingNum: Float = 3.14f
    val doubleNum: Double = 3.1411593646876666

    //String DataType
    val stringVar: String = "Hello Scala"

    //Character DataTypes
    val charvar: Char = 'A'

    //Unit Data
    val unitValue: Unit = ()

    //Printing values
    println(s"Integer: $intNum")
    println(s"String: $stringVar")
    println(s"Char: $charvar")
    println(s"Float: $FloatingNum")
    println(s"Byte: $byteNum")
    println(s"Double Num : $doubleNum")
    println(s"LongNum : $longNum")

    //Mutable Data Types
    //Boolean -true, false
    var boolvar: Boolean = true
    print("Boolean : " +boolvar)

    var intVar: Int = 14
    print("Integer Variable: " +intVar)

    //Updating the value
    intVar = intVar + 1000
    print("Updated val : " +intVar)
  }
}
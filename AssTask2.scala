import scala.collection.mutable
import scala.io.StdIn

case class Product(id: Int, name: String, var quantity: Int, price: Int, category: String)

class Shopping_Cart {
  private val products = mutable.Map[Int, Product]()
  private val gstRate = 0.05
  private val deliveryChargeThreshold = 200
  private val deliveryCharge = 50

  def addProduct(product: Product): Unit = {
    products(product.id) = product
    println(s"Item ${product.name} added to the cart.")
  }

  def updateProduct(id: Int, updatedproduct: Product): Unit = {
    if (products.contains(id)) {
      products(id) = updatedproduct
      println(s"Product with id $id updated.")
    } else {
      println(s"Product with id $id does not exist.")
    }
  }

  def removeProduct(id: Int): Unit = {
    if (products.contains(id)) {
      products.remove(id)
      println(s"Item with id $id removed from the cart.")
    } else {
      println(s"Item with id $id does not exist.")
    }
  }

  def ProductviewCart(): Unit = {
    println("Products in your cart:")
    products.values.foreach { product =>
      println(s"ID: ${product.id}, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}, Category: ${product.category}")
    }
  }

  def totalProductPrice(withGST: Boolean = true): Double = {
    val subtotal = products.values.map(product => product.quantity * product.price).sum
    val gst = if (withGST) subtotal * gstRate else 0
    val total = subtotal + gst
    val finalTotal = if (total < deliveryChargeThreshold) total + deliveryCharge else total
    println(f"Subtotal: $$${subtotal}%.2f, GST: $$${gst}%.2f, Total: $$${finalTotal}%.2f")
    finalTotal
  }
}

class PaymentGateway {
  def processPayment(amount: Double, paymentMethod: String): String = {
    paymentMethod match {
      case "Credit Card" | "Debit Card" | "UPI" =>
        s"Payment of $$${amount}%.2f processed successfully using $paymentMethod."
      case _ =>
        s"Payment method $paymentMethod not supported."
    }
  }
}

object ShoppingCart extends App {
  val cart = new Shopping_Cart
  val paymentGateway = new PaymentGateway

  def menu(): Unit = {
    println(
      """
        |1. Add Item
        |2. Update Item
        |3. Remove Item
        |4. View Cart
        |5. Calculate Total
        |6. Make Payment
        |7. Exit
        |""".stripMargin)
  }

  var cont = false

  while (!cont) {
    menu()
    println("Enter the Choice : ")
    val user_choice = scala.io.StdIn.readInt()

    user_choice match {
      case 1 =>
        println("Enter product details (id, name, quantity, price, category):")
        val input = StdIn.readLine().split(",")
        try {
          if (input.length == 5) {
            val id = input(0).toInt
            val name = input(1)
            val quantity = input(2).toInt
            val price = input(3).toInt
            val category = input(4)
            val product = Product(id, name, quantity, price, category)
            cart.addProduct(product)
          } else {
            throw new IllegalArgumentException("Invalid input format.")
          }
        } catch {
          case e: NumberFormatException =>
            println("Invalid input format. Please enter numeric values for quantity and price.")
          case e: IllegalArgumentException =>
            println(e.getMessage)
        }

      case 2 =>
        println("Enter product id to update:")
        val id = StdIn.readInt()
        println(s"Enter updated item details (name, quantity, price, category):")
        val input = StdIn.readLine().split(",").map(_.trim)
        try {
          if (input.length == 4) {
            val name = input(0)
            val quantity = input(1).toInt
            val price = input(2).toInt
            val category = input(3)
            val updatedproduct = Product(id, name, quantity, price, category)
            cart.updateProduct(id, updatedproduct)
          } else {
            throw new IllegalArgumentException("Invalid input format.")
          }
        } catch {
          case e: NumberFormatException =>
            println("Invalid input format. Please enter numeric values for quantity and price.")
          case e: IllegalArgumentException =>
            println(e.getMessage)
        }
      case 3 =>
          println("Enter product id to remove:")
          val id = StdIn.readInt()
          cart.removeProduct(id)

      case 4 =>
          cart.ProductviewCart()

      case 5 =>
          println("Calculate total with GST? (yes/no):")
          val withGST = StdIn.readLine().toLowerCase == "yes"
          cart.totalProductPrice(withGST)

      case 6 =>
          val total = cart.totalProductPrice()
          println("Select payment method (Credit Card, Debit Card, UPI):")
          val paymentMethod = scala.io.StdIn.readLine()
          val confirmation = paymentGateway.processPayment(total, paymentMethod)
          println(confirmation)

      case 7 =>
          cont = true

      case _ =>
            println("Invalid option. Please try again.")
    }
  }
}


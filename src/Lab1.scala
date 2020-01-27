import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Lab1 {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    println("Meal cost: ")
    val meal_cost = stdin.readLine.trim.toDouble
    println("Tip: ")
    val tip_percent = stdin.readLine.trim.toInt
    println("Tax: ")
    val tax_percent = stdin.readLine.trim.toInt

    solve(meal_cost, tip_percent, tax_percent)
  }

  // Complete the solve function below.
  def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {
    val tip : Double = meal_cost * tip_percent/100
    val tax : Double = meal_cost * tax_percent/100

    val totalCost : Double = meal_cost + tip + tax
    val total = totalCost
    println("Total: " + total)
  }
}

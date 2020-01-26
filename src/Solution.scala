object Solution {
  def main(args: Array[String]) {
    val i = 4
    val d = 4.0
    val s = "HackerRank "

    // Read values of another integer, double, and string variables
    // Note use scala.io.StdIn to read from stdin
    val ii = scala.io.StdIn.readInt()
    val dd = scala.io.StdIn.readDouble()
    val ss = scala.io.StdIn.readLine()
    // Print the sum of both the integer variables
    println(i + ii)
    // Print the sum of both the double variables
    println(d + dd)
    // Concatenate and print the string
    println(s + ss)
    // The 's' variable above should be printed first.
  }
}


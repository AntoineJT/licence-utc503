object Fibonacci {
  def recursive(a: Int): Int = a match {
      case 0 | 1 => a
      case _ => recursive(a - 2) + recursive(a - 1)
    }

  def iterative(a: Int): Int = {
    var first = 0
    var second = 1
    var tmp = 0

    for (_ <- 2 to a + 1) {
      tmp = first + second
      first = second
      second = tmp
    }

    first
  }

  def main(args:Array[String]): Unit = {
    for (i <- 5 to 20 by 5) {
      Console.printf("Recursive fibonacci %d: %d\n", i, recursive(i))
      Console.printf("Iterative fibonacci %d: %d\n", i, iterative(i))
    }
  }
}

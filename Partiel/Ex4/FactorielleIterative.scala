// Question 1.a
class FactorielleIterative {
  def compute(a: Int): Int = {
    assert(a >= 0)
    var res = a
    for (i <- 1 until a) {
      res *= (a - i)
    }
    res
  }

  def main(args:Array[String]): Unit = {
    Console.println(compute(5))
  }
}

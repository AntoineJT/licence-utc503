// Question 2.a
class FactorielleRecursive {
  def _compute(a: Int, res: Int): Int = a match {
    case 0 | 1 => res
    case _ =>
      val next = a - 1
      _compute(next, res * next)
  }

  // Apparemment on ne peut pas affecter
  // à un paramètre comme valeur par défaut
  // celle d'un autre paramètre
  def compute(a: Int): Int = _compute(a, a)

  def main(args:Array[String]): Unit = {
    Console.println(compute(5))
  }
}

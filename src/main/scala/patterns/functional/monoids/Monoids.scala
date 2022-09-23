package patterns.functional.monoids

/**
 *
 *
 * @author monilshah
 */
object Monoids {

  val intAddition: Monoid[Int] = new Monoid[Int] {
    override def op(l: Int, r: Int): Int = l+r

    override def zero: Int = 0
  }

  val stringConcatenation: Monoid[String] = new Monoid[String] {
    override def op(l: String, r: String): String = l+r

    override def zero: String = ""
  }

  val intMultiplication: Monoid[Int] = new Monoid[Int] {
    override def op(l: Int, r: Int): Int = l * r

    override def zero: Int = 1
  }

}

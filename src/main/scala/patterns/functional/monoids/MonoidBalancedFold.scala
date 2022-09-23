package patterns.functional.monoids

/**
 *
 *
 * @author monilshah
 */
object MonoidBalancedFold {

  def main(args: Array[String]): Unit = {
    val ip = Array(1,2,3,4,5,6)
    val res = MonoidOperations.balancedFold(ip, Monoids.intAddition)(identity)
    val parRes = MonoidOperations.foldMapPar(ip.toList, Monoids.intAddition)(identity)
    val composed = MonoidOperations.compose(Monoids.intAddition, Monoids.intMultiplication)
    val composedRes = MonoidOperations.foldMap(ip.toList, composed)(i => (i,i))
    println(res)
    println(parRes)
    println(composedRes)
  }

}

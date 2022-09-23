package patterns.functional.monoids

import Monoids._


/**
 *
 *
 * @author monilshah
 */
object MonoidFolding extends App{

  val intList = List(1,2,3,4,5,6)
  val stringList = List("E", "l", "e", "p", "h", "a", "n", "t")

  println(stringList.foldLeft(stringConcatenation.zero)(stringConcatenation.op))
  println(intList.foldLeft(intAddition.zero)(intAddition.op))
  println(intList.foldRight(intAddition.zero)(intAddition.op))
  println(intList.foldRight(intMultiplication.zero)(intMultiplication.op))
  println(intList.foldRight(intMultiplication.zero)(intMultiplication.op))

}

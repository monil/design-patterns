package patterns.structural.decorator

import scala.collection.compat.immutable.LazyList

trait InputReader {

  def readLines(): LazyList[String]

}

package patterns.structural.decorator

trait InputReader {

  def readLines(): LazyList[String]

}

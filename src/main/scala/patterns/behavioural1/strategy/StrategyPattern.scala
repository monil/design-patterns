package patterns.behavioural1.strategy

/**
 *
 *
 * @author monilshah
 */
class Application[T](strategy: (String) => List[T]){
  def write(file: String) = {
    println(s" Got the following data ${strategy(file)}")
  }
}

case class Person(name: String)

object StrategyFactory{
  def apply(fileName: String): (String) => List[Person] = {
    fileName match {
      case f if f.endsWith("json") => jsonParser
      case f if f.endsWith("csv") => csvParser
      case _ => defaultParser
    }
  }

  def jsonParser(file: String) : List[Person] = ???

  def csvParser(file: String) : List[Person] = ???

  def defaultParser(file: String) : List[Person] = ???

}

object StrategyUsage {

  def main(args: Array[String]): Unit = {
    val jsonApplication = new Application[Person](StrategyFactory("file.json"))
    val csvApplication = new Application[Person](StrategyFactory("file.csv"))
    println("Using the json")
    jsonApplication.write("file.json")
    println("Using the csv")
    csvApplication.write("file.csv")
  }

}

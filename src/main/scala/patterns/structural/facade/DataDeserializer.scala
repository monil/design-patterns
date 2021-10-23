package patterns.structural.facade

trait DataDeserializer {

  def parse(data: String) = {
    println("Deserializing")
  }

}

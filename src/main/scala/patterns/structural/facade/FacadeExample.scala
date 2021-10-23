package patterns.structural.facade

object FacadeExample extends App{

  val reader= new DataReader
  println(s"${reader.readPerson("")}")

}

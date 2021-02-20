package patterns.creational.prototype


case class Cell(dna: String, proteins: String){
  require(dna != "", "Cell cannot exists without a DNA")
}

object FabulousScalaPrototype {

  def main(args: Array[String]): Unit = {

    val cell1 = Cell("DNA1","P1")
    val cell2 = cell1.copy()
    val cell3 = cell2.copy(dna="DNA2")

    println(s"Cell1 : $cell1" )
    println(s"Cell2 : $cell2" )
    println(s"Cell3 : $cell3" )

  }

}

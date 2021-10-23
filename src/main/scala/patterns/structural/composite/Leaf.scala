package patterns.structural.composite

class Leaf(data: String) extends Node{

  override def print(prefix: String): Unit = {
    println(s"${prefix}${data}")
  }

}

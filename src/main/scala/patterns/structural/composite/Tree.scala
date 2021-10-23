package patterns.structural.composite

import scala.collection.mutable.ListBuffer

class Tree extends Node{

  val children : ListBuffer[Node] = ListBuffer()

  override def print(prefix: String): Unit =  {
    println(s"${prefix}(")
    children.foreach(_.print(s"${prefix}${prefix}"))
    println(s"${prefix})")
  }

  def add(node: Node): Unit ={
    children += node
  }

  def remove = {
    if(children.nonEmpty) children.remove(0)
  }

}

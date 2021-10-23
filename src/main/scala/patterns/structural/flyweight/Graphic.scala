package patterns.structural.flyweight

import scala.collection.mutable.ListBuffer

class Graphic {

  val items = ListBuffer.empty[(Int,Int,Double,Circle)]

  def addCircle(x:Int, y: Int, radius: Double, circle: Circle) = {
    items += ((x,y,radius,circle))
  }

  def draw(): Unit = {
    items.foreach {
      case (x, y, radius, circle) => {
        println(s" Drawing circle with radius $radius at ($x,$y)")
      }
    }
  }

}

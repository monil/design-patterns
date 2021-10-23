package patterns.structural.flyweight

import scala.collection.mutable

class Circle(color: Color) {

  println(s"Creating circle for of $color"  )

  override def toString = s"Circle()"
}

object Circle{

  val cache = mutable.Map.empty[Color,Circle]

  def apply(color: Color): Circle = cache.getOrElseUpdate(color,new Circle(color))

  def circleCreated: Int = cache.size

}

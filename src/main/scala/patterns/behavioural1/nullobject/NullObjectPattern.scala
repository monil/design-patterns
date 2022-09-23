package patterns.behavioural1.nullobject

/**
 *
 *
 * @author monilshah
 */
trait Text{
  def print
}

class Message extends Text{

  val number = 1
  override def print: Unit = println(number)

}

class NullMessage extends Text {
  override def print: Unit = println("No value found")
}

package patterns.behavioural1.command

import scala.collection.mutable.ListBuffer

/**
 *
 *
 * @author monilshah
 */
class RobotByNameController {

  val commandHistory = ListBuffer[() => Unit]()

  def issueCommand(command: => Unit): Unit = {
    command _ +=: commandHistory
    command
  }

  def showHistory() = {
    commandHistory.foreach(println)
  }

}

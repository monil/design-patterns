package patterns.behavioural1.command

/**
 *
 *
 * @author monilshah
 */
object CommandDesignPattern {

  def main(args: Array[String]): Unit = {
    val robot = new Robot()
    val robotController = new RobotByNameController()

    robotController.issueCommand(robot.makeSandwich)
    robotController.issueCommand(robot.pourJuice)
    robotController.issueCommand(robot.cleanup)

    robotController.showHistory()

  }

}

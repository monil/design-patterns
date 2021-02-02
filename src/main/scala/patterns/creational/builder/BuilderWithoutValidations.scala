package patterns.creational.builder

object PersonCaseExample {

  def main(args: Array[String]): Unit = {

    val husband = new Person(
      firstName = "Monil",
      lastName = "Shah",
      age = 28
    )

    val wife = new Person(
      firstName = "Apeksha",
      lastName = "Shah"
    )

    System.out.println(s"Person 1: ${husband} ")
    System.out.println(s"Person 2: ${wife} ")

  }

}


case class Person(

    firstName: String = "",
    lastName: String = "",
    age: Int = 0

)

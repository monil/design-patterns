package patterns.behavioural1.valueobject

/**
 *
 *
 * @author monilshah
 */
object ValueObjectExample {

  val date1 = DateCaseClass(1,1,2022)
  val date2 = DateCaseClass(1,1,2022)

  val regularDate1 = new DateRegularClass(1,1,2022)
  val regularDate2 = new DateRegularClass(1,1,2022)

  def main(args: Array[String]): Unit = {

    // compares via value
    println(s"Value object comparison ${date1 == date2}")

    // Also a value object pattern - not readable as compared to previous one
    println(s"Tuple comparison ${(1,1,2022) == (1,1,2022)}")

    // compares via reference
    println(s"Regular object comparison ${regularDate1 == regularDate2}")

  }

}

case class DateCaseClass(day: Int, month: Int, year: Int)

class DateRegularClass(day: Int, month: Int, year: Int)

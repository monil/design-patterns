package patterns.creational.singleton


/*
  Singleton Class
 */
object StringUtils {

  System.out.println("This will be called only when i am invoked. Hence i am lazy.")

  def countNumberOfSpaces(text: String) = text.split("\\s+").length - 1

}

object SingletonExample{

  def main(args: Array[String]): Unit = {
    val sentence = "Hello there! I am a utils example"


    System.out.println(

      s"The number of spaces in '$sentence' is: '${StringUtils.countNumberOfSpaces(sentence)}'"

    )

  }

}




package patterns.structural.decorator

import java.io.{BufferedInputStream, BufferedReader, InputStreamReader}

object StackableTraitsExample {

  def main(args: Array[String]): Unit = {

    val stream = new BufferedReader(
      new InputStreamReader(
        new BufferedInputStream(this.getClass().getResourceAsStream("data.txt"))
      )
    )

    try {
      val reader = new AdvancedInputReader(stream) with CapitalizedInputReaderTrait with Base64EncoderInputReaderTrait
      reader.readLines().foreach(println)
    } finally {
      stream.close()
    }
  }

}

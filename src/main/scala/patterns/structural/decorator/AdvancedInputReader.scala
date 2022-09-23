package patterns.structural.decorator

import java.io.BufferedReader
import scala.collection.compat.immutable.LazyList
import scala.jdk.CollectionConverters._



class AdvancedInputReader(reader: BufferedReader) extends InputReader {

  override def readLines(): LazyList[String] = {
    reader.lines().iterator().asScala.to(LazyList)
  }
}

package patterns.structural.decorator

import java.nio.charset.Charset
import java.util.Base64
import scala.collection.compat.immutable.LazyList

trait CapitalizedInputReaderTrait extends InputReader{
 abstract override def readLines(): LazyList[String] = super.readLines().map(_.toUpperCase)
}

trait Base64EncoderInputReaderTrait extends InputReader{
  abstract override def readLines(): LazyList[String] = super.readLines().map {
    case line => Base64.getEncoder().encodeToString(line.getBytes(Charset.forName("UTF-8")))
  }
}

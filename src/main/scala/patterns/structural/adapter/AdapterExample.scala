package patterns.structural.adapter

object AdapterExample {

  def main(args: Array[String]): Unit = {
    val logger = new AppLogger
    logger.info("Info")
    logger.debug("Debug")
    logger.warn("Warn")
    logger.error("Error")
  }


}

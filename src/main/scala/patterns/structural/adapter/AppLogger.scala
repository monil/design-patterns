package patterns.structural.adapter

trait Log{

  def warn(message: String)
  def info(message: String)
  def debug(message: String)
  def error(message: String)

}

class AppLogger extends Logger with Log {
  override def warn(message: String): Unit = log(message, "warn")

  override def info(message: String): Unit = log(message, "info")

  override def debug(message: String): Unit = log(message, "debug")

  override def error(message: String): Unit = log(message, "error")
}

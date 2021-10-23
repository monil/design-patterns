package patterns.structural.adapter

class Logger {

  def log(message: String, severity: String) = {
    println(s"${severity.toUpperCase} : $message")
  }

}

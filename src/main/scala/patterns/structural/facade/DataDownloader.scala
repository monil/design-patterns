package patterns.structural.facade

trait DataDownloader {

  def download(url: String) : Array[Byte] = {
    println("Downloading...")
  }

}

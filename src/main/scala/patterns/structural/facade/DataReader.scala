package patterns.structural.facade

class DataReader extends DataDownloader with DataDecoder with DataDeserializer {

  def readPerson(url: String) = {
    parse(decode(download(url)))
  }

}

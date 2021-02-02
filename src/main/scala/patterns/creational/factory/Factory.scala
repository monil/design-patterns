package patterns.creational.factory


trait SimpleConnection{

  def getName(): String

  def executeQuery(query: String) : Unit

}

class SimpleMongoConnection extends SimpleConnection {

  override def getName(): String = "SimpleMongoConnection"

  override def executeQuery(query: String): Unit = {
    println(s"Executing query $query in $getName()")
  }

}

class SimpleCassandraConnection extends SimpleConnection{
  override def getName(): String = "SimpleCassandraConnection"

  override def executeQuery(query: String): Unit = {
    println(s"Executing query $query in $getName()")
  }
}

trait DatabaseClient{

  def executeQuery(query: String) = {
    val connection = connect()
    connection.executeQuery(query)
  }

  protected def connect() : SimpleConnection

}

class MongoClient extends DatabaseClient{
  override protected def connect(): SimpleConnection = new SimpleMongoConnection
}

class CassandraClient extends DatabaseClient{
  override protected def connect(): SimpleConnection = new SimpleCassandraConnection
}

object Connection {
  def main(args: Array[String]): Unit = {
    val mongoClient = new MongoClient
    mongoClient.executeQuery("Select * from Mongo")

    val cassandraClient = new CassandraClient
    cassandraClient.executeQuery("Select * from Cassandra")
  }
}

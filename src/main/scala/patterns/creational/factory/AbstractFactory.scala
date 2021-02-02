package patterns.creational.factory


trait DatabaseConnectionFactory{

  def connect(): SimpleConnection

}

class MongoConnectionFactory extends DatabaseConnectionFactory {

  override def connect(): SimpleConnection = new SimpleMongoConnection

}

class CassandraConnectionFactory extends DatabaseConnectionFactory {

  override def connect(): SimpleConnection = new SimpleCassandraConnection

}

class DatabaseClientClass(databaseConnectionFactory: DatabaseConnectionFactory){

  def executeQuery(query:String) = {
    val connection = databaseConnectionFactory.connect()
    connection.executeQuery(query)
  }

}


object AbstractFactory extends App{

  val mongoClient = new DatabaseClientClass(new MongoConnectionFactory)
  mongoClient.executeQuery("select * from mongoDb")

  val cassandraClient = new DatabaseClientClass(new CassandraConnectionFactory)
  cassandraClient.executeQuery("select * from cassandra")

}

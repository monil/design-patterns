package patterns.structural.bridge

object ScalaBridgeExample extends App{

  val p1 = new SimplePasswordConverterScala with SHA256Hasher
  val p2 = new SimplePasswordConverterScala with Md5Hasher
  val p3 = new SaltedPasswordConverterScala("*jsfdsf^$%") with Sha1Hasher
  val p4 = new SaltedPasswordConverterScala("*jsfdsf^$%") with SHA256Hasher

  println("Password SHA256 password in " + p1.convert("password"))
  println("Password MD5 password in " + p2.convert("password"))
  println("Salted SHA1 password in  " +p3.convert("password"))
  println("Salted SHA25 password in " + p4.convert("password"))

}

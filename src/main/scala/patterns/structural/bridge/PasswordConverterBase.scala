package patterns.structural.bridge

abstract class PasswordConverterBase {
  self : Hasher =>
  def convert(password: String) :  String
}

class SimplePasswordConverterScala extends PasswordConverterBase{
  self: Hasher =>
  override def convert(password: String): String = hash(password)
}

class SaltedPasswordConverterScala(salt: String) extends PasswordConverterBase {
  self: Hasher =>
  override def convert(password: String): String = hash(s"${salt}:${password}")
}




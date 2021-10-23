package patterns.structural.bridge

import java.security.MessageDigest
import org.apache.commons.codec.binary.Hex


trait Hasher {

  def hash(data: String) : String

  protected def getDigest(algorithm: String, data: String) = {
    val crypt = MessageDigest.getInstance(algorithm)
    crypt.reset()
    crypt.update(data.getBytes("UTF-8"))
    crypt
  }

}

trait Sha1Hasher extends Hasher{
  override def hash(data: String) : String =
    new String(Hex.encodeHex(getDigest("SHA-1",data).digest()))
}

trait SHA256Hasher extends Hasher{
  override def hash(data: String) : String =
    new String(Hex.encodeHex(getDigest("SHA-256",data).digest()))
}

trait Md5Hasher extends Hasher{
  override def hash(data: String) : String =
    new String(Hex.encodeHex(getDigest("MD5",data).digest()))
}


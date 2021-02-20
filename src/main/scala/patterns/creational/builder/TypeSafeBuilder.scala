package patterns.creational.builder


sealed trait BuildStep
sealed trait HasFirstName extends BuildStep
sealed trait HasLastName extends BuildStep

class HumanBuilder[PassedStep <: BuildStep] private (var firstName: String,
var lastName: String,
var age: Integer){

  protected def this() = this("","",0)

  protected def this(hb: HumanBuilder[_]) = this(
    hb.firstName,hb.lastName,hb.age
  )


  def setFirstName(firstName: String) : HumanBuilder[HasFirstName] = {
    this.firstName = firstName
    new HumanBuilder[HasFirstName](this)

  }

  def setLastName(lastName: String)(implicit ev: PassedStep =:= HasFirstName) : HumanBuilder[HasLastName] = {
    this.lastName = lastName
    new HumanBuilder[HasLastName](this)
  }

  def setAge(age: Integer) : HumanBuilder[PassedStep] = {
    this.age = age
    this
  }

  def build()(implicit ev: PassedStep =:= HasLastName): Human = new Human(
    firstName,
    lastName,
    age
  )

}

object HumanBuilder{
  def apply() = new HumanBuilder[BuildStep]()
}

class Human(

  val firstName: String,
  val lastName: String,
  val age: Integer

){

  protected def this() = this("","",0)

  protected def this(hb: HumanBuilder[_]) = this(
    hb.firstName,
    hb.lastName,
    hb.age
  )

}


object TypeSafeBuilder extends App{

  val humanBuilder =  HumanBuilder()
    .setFirstName("")
    .setLastName("")
    .setAge(0)
    .build()

}

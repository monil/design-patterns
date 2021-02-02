package patterns.creational.factory


trait Animal
class Bird extends Animal
class Mammal extends Animal
class Fish extends Animal

object Animal{
  def apply(animal: String) = animal.toLowerCase match {
    case "bird" => new Bird
    case "mammal" => new Mammal
    case "fish" => new Fish
    case default => throw new RuntimeException("Invalid animal type")
  }
}

object StaticFactory extends App {

  Animal("Bird")
  Animal("Mammal")

}

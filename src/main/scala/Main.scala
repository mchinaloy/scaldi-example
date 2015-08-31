
import scaldi.Injectable

import scala.example.application.{AnimalModule, AnimalManager}
import scala.example.domain.AnimalNames.name
import Injectable._

object Main extends App {

  private implicit val modules = new AnimalModule
  private val animalManager = inject[AnimalManager]

  animalManager.createRandomAnimal()
  animalManager.createDogWithName
  animalManager.createDogWithName("Fido")

}

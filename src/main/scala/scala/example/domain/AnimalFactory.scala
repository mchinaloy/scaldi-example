package scala.example.domain

import scala.util.Random

class AnimalFactory {

  def createRandomAnimal(): Animal = {
    val randomNumber = Random.nextInt(10)
    if (randomNumber < 6) {
      return Bird(AnimalFactory.DEFAULT_BIRD_NAME, AnimalFactory.DEFAULT_COLOR)
    }
    Dog(AnimalFactory.DEFAULT_DOG_NAME, AnimalFactory.DEFAULT_COLOR)
  }

  def createDogWithName(name: String): Dog = {
    Dog(name, AnimalFactory.DEFAULT_COLOR)
  }

}

object AnimalFactory {
  val DEFAULT_BIRD_NAME = "aBird"
  val DEFAULT_DOG_NAME = "aDog"
  val DEFAULT_COLOR = "aColor"
}
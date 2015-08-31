package scala.example.application

import scala.example.domain.{Dog, Animal}

trait AnimalManager {

  def createRandomAnimal(): Animal
  def createDogWithName(implicit name: String): Dog

}

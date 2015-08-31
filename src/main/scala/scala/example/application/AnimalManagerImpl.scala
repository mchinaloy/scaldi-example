package scala.example.application

import scaldi.Injector

import scala.example.domain.{Bird, Dog, AnimalFactory, Animal}

class AnimalManagerImpl(implicit inj: Injector) extends AnimalManager {

  private val animalFactory = new AnimalFactory

  def createRandomAnimal(): Animal = {
    val animal = animalFactory.createRandomAnimal()
    def matchAnimal(x: Animal): String = x match {
      case x: Dog => "Created a Dog!"
      case x: Bird => "Created a Bird"
    }
    println(matchAnimal(animal))
    animal
  }

  def createDogWithName(implicit name: String): Dog = {
    val dog = animalFactory.createDogWithName(name)
    println("Created a Dog with name: " + dog.name)
    dog
  }

}

import org.scalatest.FunSuite

import scala.example.application.{AnimalModule, AnimalManagerImpl}
import scala.example.domain.{Animal, AnimalNames, Dog}
import scala.example.domain.AnimalNames.name

class AnimalManagerImplUTest extends FunSuite {

  private implicit val modules = new AnimalModule
  private val testObj = new AnimalManagerImpl()

  test("testCreateRandomAnimal") {
    // act
    val result = testObj.createRandomAnimal()

    // assert
    assert(result.isInstanceOf[Animal])
  }

  test("testCreateDogWithImplicitName") {
    // act
    val result = testObj.createDogWithName

    // assert
    assert(result.isInstanceOf[Dog])
    assert(result.name.equals(AnimalNames.name))
  }

  test("testCreateDogWithName") {
    // setup
    val expectedName: String = "Fido"

    // act
    val result = testObj.createDogWithName(expectedName)

    // assert
    assert(result.isInstanceOf[Dog])
    assert(result.name.equals(expectedName))
  }

}

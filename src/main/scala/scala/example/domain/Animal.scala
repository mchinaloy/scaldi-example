package scala.example.domain

sealed abstract class Animal {
  val name: String
  val color: String
}

case class Dog(name: String, color: String) extends Animal
case class Bird(name: String, color: String) extends Animal

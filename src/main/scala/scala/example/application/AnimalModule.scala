package scala.example.application

import scaldi.Module

class AnimalModule extends Module {

  bind[AnimalManager] to new AnimalManagerImpl()

}

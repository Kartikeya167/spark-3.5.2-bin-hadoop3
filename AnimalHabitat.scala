trait Animal {
    def atype(): Unit
}

trait Habitat {
    def habitat(): Unit
}

class AnimalHabitat extends Animal with Habitat {
    def atype(): Unit = {
        println("Herbivore Animal")
    }

    def habitat(): Unit = {
        println("Lives in Forest")
    }

    def acolor(): Unit = {
        println("Color is Black")
    }
}

object AnimalHabitat {
    def main(args: Array[String]): Unit = {
        val a = new AnimalHabitat()
        a.atype()
        a.habitat()
        a.acolor()
    }
}

// To run the main method without args in a Scala script or REPL, use:
// AnimalHabitat.main(Array())

// array
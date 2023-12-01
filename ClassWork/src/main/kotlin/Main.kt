import kotlin.random.Random

open class Pet(val name: String) {
    override fun toString(): String = ""
}

class Cat(name: String) : Pet(name) {
    override fun toString(): String = "MEOW"
}

class Dog(name: String) : Pet(name) {
    override fun toString(): String = "BARK"
}

class PetContainer<T: Pet> {
    private val pets = mutableListOf<T>()

    fun putIntoContainer(pet: T) {
        pets.add(pet)
    }

    fun hearVoice(): T? {
        if (pets.isEmpty()) return null
        val randomPet = pets[Random.nextInt(pets.size)]
        println("A pet's voice came through the container: ${randomPet.toString()}. Can you guess who this is?")
        return randomPet
    }


}

fun main() {
    val pets = PetContainer<Pet>()
    pets.putIntoContainer(Cat("Skoti"))
    pets.putIntoContainer(Dog("Arbuz"))
    pets.putIntoContainer(Cat("Koshka"))
    pets.putIntoContainer(Dog("Dynya"))

    val randomPet = pets.hearVoice()
    print("Enter 0 for Dog\n1 for Cat: ")
    val userGuess = readLine()
    if (randomPet != null) {
        val correctAnswer = if (randomPet is Dog) "0" else "1"
        if (userGuess == correctAnswer) {
            println("Congratulations!!!!")
        } else {
            println("Sorry, you didn't recognize your pet :(")
        }
    }
}

import taskMemento.Game
import taskMemento.SaveFile
import taskVisitor.Cat
import taskVisitor.Dog
import taskVisitor.Turtle

fun main(args: Array<String>) {

    // TODO: Visitor Task

    val pets = arrayOf(Cat(), Dog(), Turtle())

    try {
        for (pet in pets) {
            when (pet) {
                is Cat -> {
                    pet.checkUpCat()
                }

                is Dog -> {
                    pet.checkUpDog()
                }

                is Turtle -> {
                    pet.checkUpTurtle()
                }
            }
        }
    } catch (ex: InterruptedException) {
        println("The program was interrupted unexpectedly")
    }

    println("===================================");


    // TODO: Memento Task
    var game = Game(0, "Newbie")
    game.level = 1
    game.rank = "Amateur"


    // Making a save file from game
    val save = SaveFile(game.level, game.rank)

    // Creating new game from save file
    game = Game(save.level, save.rank)

    println(game)

}
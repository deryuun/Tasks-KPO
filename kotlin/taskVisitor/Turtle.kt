package taskVisitor

import java.util.*

class Turtle(private var healthState: Int = 0) : Pet {


    init {
        val random = Random()
        healthState = random.nextInt(2)
    }

    @Throws(InterruptedException::class)
    fun checkUpTurtle() {
        println("Checking up on turtle...")
        Thread.sleep(2000)
        println("Checking the shell...")
        Thread.sleep(2000)
        if (healthState == 0) {
            println("The turtle is doing fine")
            return
        }
        println("The turtle is sick :(")
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }


}
package taskVisitor

import java.util.*

class Dog(private var healthState: Int = 0) : Pet {

    init {
        val random = Random()
        healthState = random.nextInt(2)
    }

    @Throws(InterruptedException::class)
    fun checkUpDog() {
        println("Checking up on dog...")
        Thread.sleep(2000)
        println("The tail is wagging...")
        Thread.sleep(2000)
        println("Checking the nose...")
        Thread.sleep(2000)
        if (healthState == 0) {
            println("The dog is doing fine")
            return
        }
        println("The dog is sick :(")
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}
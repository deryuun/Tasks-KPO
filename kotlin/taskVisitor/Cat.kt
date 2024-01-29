package taskVisitor

import java.util.*

class Cat(private var healthState: Int = 0) : Pet {

    init {
        val random = Random()
        healthState = random.nextInt(2)
    }

    @Throws(InterruptedException::class)
    fun checkUpCat() {
        println("Checking up on cat...")
        Thread.sleep(2000)
        println("Checking the fur...")
        Thread.sleep(2000)
        println("Checking the whiskers...")
        Thread.sleep(2000)
        if (healthState == 0) {
            println("The cat is doing fine")
            return
        }
        println("The cat is sick :(")
    }

    override fun accept(v: Visitor) {
        v.visit(this)
    }
}
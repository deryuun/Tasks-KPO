package taskVisitor

class ConcreteVisitor : Visitor {
    override fun visit(e: Cat) {
        e.checkUpCat()
    }

    override fun visit(e: Dog) {
        e.checkUpDog()
    }

    override fun visit(e: Turtle) {
        e.checkUpTurtle()
    }
}
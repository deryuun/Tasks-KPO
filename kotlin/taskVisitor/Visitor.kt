package taskVisitor

interface Visitor {
    fun visit(e: Cat)
    fun visit(e: Dog)
    fun visit(e: Turtle)
}
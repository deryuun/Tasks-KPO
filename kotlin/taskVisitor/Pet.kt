package taskVisitor

interface Pet {
    fun accept(v: Visitor)
}
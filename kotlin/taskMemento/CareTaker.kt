package taskMemento

class CareTaker(val game: Game, val files: MutableList<SaveFile>) {
    fun doSomething() {
        files.add(game.save())
    }

    fun undo() {
        game.restore(SaveFile(files.removeAt(files.size - 1).level, files.removeAt(files.size - 1).rank))
    }
}
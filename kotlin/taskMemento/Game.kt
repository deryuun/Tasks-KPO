package taskMemento


data class Game(var level: Int, var rank: String) {
    fun save(): SaveFile {
        return SaveFile(level, rank);
    }

    fun restore(m: SaveFile) {
        m.level;
        m.rank;
    }
}



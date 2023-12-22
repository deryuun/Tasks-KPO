fun String.stupidFilter(predicate: (Char) -> Boolean): String {
    return this.filter(predicate).reversed()
}

fun <T> Collection<T>.join(separator: String, beforePrint: (T) -> String): String {
    return this.joinToString(separator) { beforePrint(it) }
}

fun main() {
    val result = "ab2s3fx4c1".stupidFilter { it in 'a'..'z' }
    println(result)

    val numbers = listOf(1, 2, 3, 4)
    val joinedString = numbers.join(" and ") { "it is number $it" }
    println(joinedString)
}

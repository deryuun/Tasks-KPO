fun makeArray(): Array<Int> {
    println("Enter N:")
    val size = readlnOrNull()?.toIntOrNull() ?: 0
    val array = Array(size) { 0 }

    for (i in array.indices) {
        array[i] = readlnOrNull()?.toIntOrNull() ?: 0
    }

    return array
}

fun sortArrayDesc(arr: Array<Int>) {
    val sortedArray = arr.sortedArrayDescending()
    println("Reverse sorted array: ${sortedArray.joinToString(", ")}")
}

// Используйте эту функцию для запуска кода
fun main() {
    val arr = makeArray()
    println("Entered array: ${arr.joinToString(", ")}")

    sortArrayDesc(arr)
}

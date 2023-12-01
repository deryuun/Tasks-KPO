/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    val list = array.toMutableList()
    for (i in list.indices) {
        for (j in list.indices) {
            if (i != j && array[j] == list[i]) {
                list[j] = "blahblah"
            }
        }
    }
    return  list
}


/**
 *  Задание 2: Вернуть количество уникальных слов в строке.
 *  Слова в строке обязательно разделяются пробелом.
 *  (1 балл)
 */
fun uniqueWords(text: String): Int {
    val list = text.split(" ")
    val frequencyMap = list.groupingBy { it }.eachCount()
    val uniq = mutableListOf<String>()

    for (element in list) {
        if (frequencyMap[element] == 1) {
            uniq.add(element)
        }
    }
    return uniq.size
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val text = "Hello world world hello hello banana Banana"
    println(uniqueWords(text))

    // Вызвать для text и вывести результат замены на экран
    val list = replaceElements(text.split(" "))
    for (i in list.indices) {
        println(list[i])
    }
}
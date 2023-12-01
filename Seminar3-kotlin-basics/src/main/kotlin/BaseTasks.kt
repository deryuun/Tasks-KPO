import kotlin.math.pow
import kotlin.math.sqrt

/**
    Задание 1: Функция,спрашивающая у пользователя его ФИО и выводящая его на экране.
    (0.5 балла)
    Формат вывода:
        " Фамилия:
          Имя:
          Отчество:
        "
 */
fun askForInput() {
    println("Введите ваше ФИО:")
    val array = Array(3) { "" }

    for (i in array.indices) {
        array[i] = readlnOrNull().orEmpty()
    }
    println("Фамилия:  ${array[0]}")
    println("Имя:  ${array[1]}")
    println("Отчество:  ${array[2]}")

}

/**
    Задание 2: Функция, вычисляющая и возвращающая корни квадратного уравнения. (1 балл)
 */
fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    val D = b.pow(2.0) - 4 * a * c
    val x_1 = (-b + sqrt(D)) / (2 * a)
    val x_2 = (-b - sqrt(D)) / (2 * a)
    return x_1 to x_2
}

/**
    Задание 3: Вывести на экран трёхзначные десятичные числа s, все цифры которых одинаковы.
    (2 балла)
 */
fun printSameDigitNumbers() {
    for (digit in 1..9) {
        val number = digit * 111
        println(number)
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 =${roots.second}")

    printSameDigitNumbers()
}
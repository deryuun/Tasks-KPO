/**
 * Задание 1: Объявите классы Circle и Square – наследников базового (Point).
 * Реализуйте readonly свойство, вычисляющее площадь каждой фигуры, а также функцию display()
 * для вывода информации о фигуре на экран.
 *
 * (3 балла)
 */

open class Point(val X: Double, val Y: Double) {

    open val area: Double = 0.0

    open fun display() {
        // Формат вывода – S = ... , X = ... , Y = ...
    }
}
class Circle(X: Double, Y: Double, val radius: Double) : Point(X, Y) {

    override val area: Double
        get() = Math.PI * radius * radius

    override fun display() {
        println("Circle: S = $area, X = $X, Y = $Y")
    }
}
class Square(X: Double, Y: Double, val length: Double) : Point(X, Y) {

    override val area: Double
        get() = length * length

    override fun display() {
        println("Square: S = $area, X = $X, Y = $Y")
    }
}

// Используйте эту функцию для запуска кода
// Раскомментируйте нужные участки в процессе реализации
fun main() {
    val p = Point(34.0, 56.0)
    val c = Circle(46.0, 34.0, 7.0)
    val s = Square(46.0, 34.0, 8.0)
    p.display()
    c.display()
    s.display()
}
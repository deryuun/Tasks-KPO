import java.io.File
import java.lang.Exception
import java.nio.charset.Charset

open class Writer {
    @Throws(Exception::class)
    open fun write(message: String) {}
}

class FileWriter(val path: String = "") {
    @Throws(Exception::class)
    fun saveToFile(str: String) {
        val file = File(path)
        file.writeText(str, Charset.defaultCharset())
    }
}

class Notifier(val message: String) {
    @Throws(Exception::class)
    fun notify(writer: Writer) {
        writer.write(message)
    }
}

class Adapter(private val adaptee: FileWriter) : Writer() {
    @Throws(Exception::class)
    override fun write(message: String) {
        adaptee.saveToFile(message)
    }
}
fun main(args: Array<String>) {
    val adapter = Adapter(FileWriter())
    val writer = Writer()
    val notifier = Notifier("lala")
    notifier.notify(writer)
    notifier.notify(adapter)
}
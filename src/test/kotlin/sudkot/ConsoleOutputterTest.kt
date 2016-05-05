package sudkot

import org.junit.Test

/**
 * @author Jörn Schricker
 */
class ConsoleOutputterTest {

    @Test
    fun runIt() {
        val field = SudokuField()
        field.set(0, 0, 1)

        var outputter = ConsoleOutputter()
        outputter.output(field)

    }
}
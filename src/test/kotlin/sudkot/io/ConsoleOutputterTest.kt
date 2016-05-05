package sudkot.io

import org.junit.Test
import sudkot.SudokuBoard
import sudkot.io.ConsoleOutputter

/**
 * @author Jörn Schricker
 */
class ConsoleOutputterTest {

    @Test
    fun runIt() {
        val board = SudokuBoard()
        board.set(0, 0, 1)
        board.set(8, 8, 5)
        board.set(7, 0, 3)

        var outputter = ConsoleOutputter()
        outputter.output(board)

    }
}
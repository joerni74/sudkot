package sudkot

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * @author Jörn Schricker
 */
class SudokuBoardTest {

    @Test
    fun checkShow() {
        val board = SudokuBoard()
        assertNull(board.show(0, 0))
        board.set(8, 8, 5)
        board.set(7, 0, 3)
        assertEquals(5, board.show(8, 8))
        assertEquals(3, board.show(7, 0))
    }
}
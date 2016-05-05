package sudkot

import org.junit.Test
import kotlin.test.assertNull

/**
 * @author Jörn Schricker
 */
class SudokuFieldTest {

    @Test
    fun checkShow() {
        val field = SudokuField()
        assertNull(field.show(0, 0))
    }
}
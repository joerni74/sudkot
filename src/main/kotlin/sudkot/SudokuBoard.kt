package sudkot

/**
 * SudokuField
 *
 * @author Jörn Schricker
 */
class SudokuBoard() {

    private val board = Array(81, { i -> SodukuField(null)})

    fun show(col: Int, row: Int): Int? {
        if (col > 8 || col < 0 || row > 8 || row < 0) {
            throw IllegalArgumentException("row/col not between 1 and 9")
        }
        val index = getIndex(col, row) //col * 9 + row
        return board[index].value
    }

    private fun getIndex(col: Int, row: Int): Int {
        return col * 9 + row;
    }

    fun set(col: Int, row: Int, value: Int) {
        if (value > 9 || value < 1) {
            throw IllegalArgumentException("value not between 1 and 9")
        }
        if (col > 8 || col < 0 || row > 8 || row < 0) {
            throw IllegalArgumentException("row/col not between 1 and 9")
        }
        val index = getIndex(col, row)
        board[index].value = value;
    }



}

class SodukuField(var value: Int?) {

}

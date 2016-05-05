package sudkot.io

import sudkot.SudokuBoard

/**
 * defines a outputter that can output SudokuField
 *
 * @author Jörn Schricker
 */
interface SudokoBoardOutputter {

    /**
     * output it in some way
     *
     * @param board the SudokuField to output
     */
    fun output(board: SudokuBoard);
}
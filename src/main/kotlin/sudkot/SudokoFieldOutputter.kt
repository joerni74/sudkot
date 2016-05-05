package sudkot

/**
 * defines a outputter that can output SudokuField
 * @author Jörn Schricker
 */
interface SudokoFieldOutputter {

    /**
     * output it in some way
     */
    fun output(field: SudokuField);
}
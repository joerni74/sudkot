package sudkot.io

import sudkot.SudokuBoard

/**
 * @author Jörn Schricker
 */
class ConsoleOutputter : SudokoBoardOutputter {

    override fun output(board: SudokuBoard) {
        System.out.println("+-+-+-+-+-+-+-+-+-+")
        for (row: Int in 0..8) {
            System.out.print("|")
            for (i: Int in 0..8) {
                var fieldValue = " ";
                if (board.show(row, i) != null) {
                    fieldValue = "" + board.show(row, i);
                }
                System.out.print(fieldValue);
                System.out.print("|")
            }
            System.out.println();
            System.out.println("+-+-+-+-+-+-+-+-+-+")
        }
    }
}
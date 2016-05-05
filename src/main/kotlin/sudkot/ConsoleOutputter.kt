package sudkot

/**
 * @author Jörn Schricker
 */
class ConsoleOutputter : SudokoFieldOutputter {

    override fun output(field: SudokuField) {
        System.out.println("+-+-+-+-+-+-+-+-+-+")
        for (row: Int in 0..8) {
            System.out.print("|")
            for (i: Int in 0..8) {
                var fieldValue = " ";
                if (field.show(row, i) != null) {
                    fieldValue = "" + field.show(row, i);
                }
                System.out.print(fieldValue);
                System.out.print("|")
            }
            System.out.println();
            System.out.println("+-+-+-+-+-+-+-+-+-+")
        }
    }
}
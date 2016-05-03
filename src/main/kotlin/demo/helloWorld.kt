package demo

import sudkot.SudokuField

fun getGreeting(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("world!")

    return words.joinToString(separator = " ")
}

fun main(args: Array<String>) {
    println(getGreeting())

    val field = SudokuField()

}


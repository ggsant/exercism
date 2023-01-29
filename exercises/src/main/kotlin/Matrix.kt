class Matrix(private val matrixAsString: String) {
    private val rows = this.matrixAsString.split("\n")
    fun column(colNr: Int): List<Int> {
        var colum = listOf<Int>()
        for (i in rows.indices)
            colum = colum.plus(row(i + 1)[colNr - 1])
        return colum
    }
    fun row(rowNr: Int): List<Int> = rows[rowNr - 1].split(" ").map { it.toInt() }
}

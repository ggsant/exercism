class Squares(var num: Int) {

    fun sumOfSquares(): Int = (num * (num + 1) * ((num * 2) + 1)) / 6

    fun squareOfSum(): Int {
        val sum = (num * (num + 1)) / 2
        return sum * sum
    }

    fun difference(): Int = squareOfSum() - sumOfSquares()
}

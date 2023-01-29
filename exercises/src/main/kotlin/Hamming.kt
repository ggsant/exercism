object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.length != rightStrand.length) throw IllegalArgumentException("left and right strands must be of equal length")
        if (leftStrand == rightStrand) return 0
        var hammingCounter = 0
        for (i in leftStrand.indices)
            if(leftStrand[i] != rightStrand[i]) hammingCounter++
        return hammingCounter
    }
}

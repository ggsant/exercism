object HandshakeCalculator {
    private infix fun Int.hasBitSet(bit: Int): Boolean = ((this shr bit) and 0x1) == 1
   
    fun calculateHandshake(number: Int): List<Signal> {
        return mutableListOf<Signal>().apply {
            if (number hasBitSet 0) add(Signal.WINK)
            if (number hasBitSet 1) add(Signal.DOUBLE_BLINK)
            if (number hasBitSet 2) add(Signal.CLOSE_YOUR_EYES)
            if (number hasBitSet 3) add(Signal.JUMP)
            if (number hasBitSet 4) reverse()
        }
    }
}

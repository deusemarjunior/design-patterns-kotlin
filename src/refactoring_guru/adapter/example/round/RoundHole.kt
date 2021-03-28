package refactoring_guru.adapter.example.round

/**
 * EN: RoundHoles are compatible with RoundPegs.
 *
 * RU: КруглоеОтверстие совместимо с КруглымиКолышками.
 */
open class RoundHole(val radius: Double) {
    open fun fits(peg: RoundPeg): Boolean {
        val result: Boolean
        result = radius >= peg.radius
        return result
    }
}
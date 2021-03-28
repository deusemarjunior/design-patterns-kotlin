package refactoring_guru.adapter.example.round

/**
 * EN: RoundPegs are compatible with RoundHoles.
 *
 * RU: КруглыеКолышки совместимы с КруглымиОтверстиями.
 */
open class RoundPeg {
    open var radius = 0.0
    //private set

    constructor() {}
    constructor(radius: Double) {
        this.radius = radius
    }
}
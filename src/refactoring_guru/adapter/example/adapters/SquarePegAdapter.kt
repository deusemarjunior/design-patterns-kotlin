package refactoring_guru.adapter.example.adapters

import refactoring_guru.adapter.example.round.RoundPeg
import refactoring_guru.adapter.example.square.SquarePeg

/**
 * EN: Adapter allows fitting square pegs into round holes.
 *
 * RU: Адаптер позволяет использовать КвадратныеКолышки и КруглыеОтверстия
 * вместе.
 */
class SquarePegAdapter(private val peg: SquarePeg) : RoundPeg() {
    // EN: Calculate a minimum circle radius, which can fit this peg.
    //
    // RU: Рассчитываем минимальный радиус, в который пролезет этот колышек.
    override var radius: Double
        get() {
            val result: Double
            // EN: Calculate a minimum circle radius, which can fit this peg.
            //
            // RU: Рассчитываем минимальный радиус, в который пролезет этот колышек.
            result = Math.sqrt(Math.pow(peg.width / 2, 2.0) * 2)
            return result
        }
        set(radius) {
            super.radius = radius
        }
}
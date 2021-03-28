package refactoring_guru.adapter.example.square

import refactoring_guru.adapter.example.round.RoundPeg
import refactoring_guru.adapter.example.square.SquarePeg
import kotlin.jvm.JvmStatic
import refactoring_guru.adapter.example.round.RoundHole
import refactoring_guru.adapter.example.adapters.SquarePegAdapter

/**
 * EN: SquarePegs are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 *
 * RU: КвадратныеКолышки несовместимы с КруглымиОтверстиями (они остались в
 * проекте после бывших разработчиков). Но мы должны как-то интегрировать их в
 * нашу систему.
 */
class SquarePeg(val width: Double) {
    val square: Double
        get() {
            val result: Double
            result = Math.pow(width, 2.0)
            return result
        }
}
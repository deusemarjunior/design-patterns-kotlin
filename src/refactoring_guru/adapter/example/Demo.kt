package refactoring_guru.adapter.example

import refactoring_guru.adapter.example.round.RoundPeg
import refactoring_guru.adapter.example.square.SquarePeg
import kotlin.jvm.JvmStatic
import refactoring_guru.adapter.example.round.RoundHole
import refactoring_guru.adapter.example.adapters.SquarePegAdapter

/**
 * EN: Somewhere in client code...
 *
 * RU: Где-то в клиентском коде...
 */
object Demo {
    @JvmStatic
    fun main(args: Array<String>) {
        // EN: Round fits round, no surprise.
        //
        // RU: Круглое к круглому — всё работает.
        val hole = RoundHole(5.toDouble())
        val rpeg = RoundPeg(5.0)
        if (hole.fits(rpeg)) {
            println("Round peg r5 fits round hole r5.")
        }
        val smallSqPeg = SquarePeg(2.toDouble())
        val largeSqPeg = SquarePeg(20.toDouble())
        // EN: hole.fits(smallSqPeg); // Won't compile.
        //
        // RU: hole.fits(smallSqPeg); // Не скомпилируется.

        // EN: Adapter solves the problem.
        //
        // RU: Адаптер решит проблему.
        val smallSqPegAdapter = SquarePegAdapter(smallSqPeg)
        val largeSqPegAdapter = SquarePegAdapter(largeSqPeg)
        if (hole.fits(smallSqPegAdapter)) {
            println("Square peg w2 fits round hole r5.")
        }
        if (!hole.fits(largeSqPegAdapter)) {
            println("Square peg w20 does not fit into round hole r5.")
        }
    }
}
package solution.qmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author boolenull on 21.03.2019
 */

class Q1Solution: BaseSolution, QModule {

    override fun makeResult(solution: Solution): String {
        return reduceFraction(solution.number1)
    }

    fun reduceFraction(frac: String): String {
        val fraction = frac.split("/").map { Fraction(it) }
        val nod = fraction[0].value.gcd(fraction[1].value)
        fraction.forEach { it.value /= nod }
        return "${fraction[0].value}/${fraction[1].value}"
    }
}
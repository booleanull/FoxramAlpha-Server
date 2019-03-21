package solution.zmodule

import controllers.solution.models.Solution
import solution.base.BaseSolution

/**
@author Настя Чапурина on 17.03.2019
 */

class Z8Solution: BaseSolution, ZModule {

    override fun makeResult(solution: Solution): String {
        return (mulriplyWholeWithWhole(Whole(solution.number1), Whole(solution.number2)).value).toString()
    }

    fun mulriplyWholeWithWhole(number1: Whole, number2: Whole): Whole {
        return Whole(number1.value * number2.value)
    }
}
package lotto.utils

import camp.nextstep.edu.missionutils.Randoms

// Utility class to handle random number generation
object Random {
    // Method to generate a list of 6 unique random numbers between 1 and 45
    fun pickUniqueNumbers(): List<Int> {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6) // Get 6 unique numbers between 1 and 45
    }
}
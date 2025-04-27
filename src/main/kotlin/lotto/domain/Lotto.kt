package lotto.domain

class Lotto(private val numbers: List<Int>) {
    init {
        require(numbers.size == 6) { "[ERROR] Lotto must contain exactly 6 numbers." }
        require(numbers.distinct().size == numbers.size) { "[ERROR] Lotto numbers must be unique." }
        require(numbers.all { it in 1..45 }) { "[ERROR] Lotto numbers must be between 1 and 45." }
    }

    fun matchCount(winningNumbers: List<Int>, bonusNumber: Int): Pair<Int, Boolean> {
        val matchedNumbers = numbers.filter { it in winningNumbers }
        val bonusMatched = numbers.contains(bonusNumber)

        return Pair(matchedNumbers.size, bonusMatched)
    }

    override fun toString(): String {
        return numbers.sorted().joinToString(", ")
    }
}
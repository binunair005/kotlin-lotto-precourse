package lotto.domain

class LottoTicket(private val lottoNumbers: List<Lotto>) {

    fun countMatchingPrizes(winningNumbers: List<Int>, bonusNumber: Int): Map<String, Int> {
        val prizeCounts = mutableMapOf<String, Int>()
        lottoNumbers.forEach {
            val (matchedCount, bonusMatched) = it.matchCount(winningNumbers, bonusNumber)
            val prize = when (matchedCount) {
                6 -> "1st Prize"
                5 -> if (bonusMatched) "2nd Prize" else "3rd Prize"
                4 -> "4th Prize"
                3 -> "5th Prize"
                else -> "No Prize"
            }
            prizeCounts[prize] = prizeCounts.getOrDefault(prize, 0) + 1
        }
        return prizeCounts
    }
}
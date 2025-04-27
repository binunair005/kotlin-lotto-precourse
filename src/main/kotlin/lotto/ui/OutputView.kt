package lotto.ui

import lotto.domain.LottoTicket

object OutputView {

    fun displayPurchasedTickets(tickets: List<Lotto>) {
        println("You have purchased ${tickets.size} tickets.")
        tickets.forEach {
            println(it)
        }
    }

    fun displayWinningStats(prizeCounts: Map<String, Int>, totalAmount: Int) {
        println("Winning Statistics")
        println("---")
        prizeCounts.forEach { (prize, count) ->
            val prizeAmount = when (prize) {
                "1st Prize" -> 2_000_000_000
                "2nd Prize" -> 30_000_000
                "3rd Prize" -> 1_500_000
                "4th Prize" -> 50_000
                "5th Prize" -> 5_000
                else -> 0
            }
            println("$prize – $count tickets")
        }
        val totalWinnings = prizeCounts.map { (prize, count) ->
            val prizeAmount = when (prize) {
                "1st Prize" -> 2_000_000_000
                "2nd Prize" -> 30_000_000
                "3rd Prize" -> 1_500_000
                "4th Prize" -> 50_000
                "5th Prize" -> 5_000
                else -> 0
            }
            prizeAmount * count
        }.sum()
        val returnRate = if (totalAmount > 0) totalWinnings.toDouble() / totalAmount * 100 else 0.0
        println("Total return rate is %.2f%%.".format(returnRate))
    }
}

package lotto

import lotto.ui.InputView
import lotto.domain.LottoTicket

fun main() {

    val purchaseAmount = InputView.askPurchaseAmount()
    val tickets = InputView.generateTickets(purchaseAmount)
    OutputView.displayPurchasedTickets(tickets)

    val winningNumbers = InputView.askWinningNumbers()
    val bonusNumber = InputView.askBonusNumber()

    val lottoTicket = LottoTicket(tickets)
    val prizeCounts = lottoTicket.countMatchingPrizes(winningNumbers, bonusNumber)

    OutputView.displayWinningStats(prizeCounts, purchaseAmount)
}
package lotto.tests

import lotto.domain.Lotto
import lotto.domain.LottoTicket
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class LottoTicketTest {

    @Test
    fun `should calculate correct prize count`() {
        val ticket = LottoTicket(listOf(Lotto(listOf(1, 2, 3, 4, 5, 6))))
        val prizeCounts = ticket.countMatchingPrizes(listOf(1, 2, 3, 4, 5, 6), 7)
        assertThat(prizeCounts["1st Prize"]).isEqualTo(1)
    }
}

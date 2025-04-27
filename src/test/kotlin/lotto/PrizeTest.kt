package lotto.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import lotto.domain.Prize

class PrizeTest {

    // Test for 6 matches (First prize)
    @Test
    fun `test 6 matches (1st prize)`() {
        val matchCount = 6
        val bonusMatched = false  // No bonus number matching in this case

        val prize = Prize.fromMatchCount(matchCount, bonusMatched)

        assertEquals(Prize.FIRST, prize)
        assertEquals(2_000_000_000, prize.reward)
    }

    // Test for 5 matches + bonus number (Second prize)
    @Test
    fun `test 5 matches + bonus number (2nd prize)`() {
        val matchCount = 5
        val bonusMatched = true  // Bonus number matched

        val prize = Prize.fromMatchCount(matchCount, bonusMatched)

        assertEquals(Prize.SECOND, prize)
        assertEquals(30_000_000, prize.reward)
    }

    // Test for 5 matches without bonus number (Third prize)
    @Test
    fun `test 5 matches without bonus (3rd prize)`() {
        val matchCount = 5
        val bonusMatched = false  // No bonus number matched

        val prize = Prize.fromMatchCount(matchCount, bonusMatched)

        assertEquals(Prize.THIRD, prize)
        assertEquals(1_500_000, prize.reward)
    }

    // Test for 4 matches (Fourth prize)
    @Test
    fun `test 4 matches (4th prize)`() {
        val matchCount = 4
        val bonusMatched = false  // No bonus number matched

        val prize = Prize.fromMatchCount(matchCount, bonusMatched)

        assertEquals(Prize.FOURTH, prize)
        assertEquals(50_000, prize.reward)
    }

    // Test for 3 matches (Fifth prize)
    @Test
    fun `test 3 matches (5th prize)`() {
        val matchCount = 3
        val bonusMatched = false  // No bonus number matched

        val prize = Prize.fromMatchCount(matchCount, bonusMatched)

        assertEquals(Prize.FIFTH, prize)
        assertEquals(5_000, prize.reward)
    }

    // Test for no matches (No prize)
    @Test
    fun `test no matches (no prize)`() {
        val matchCount = 0
        val bonusMatched = false  // No bonus number matched

        val prize = Prize.fromMatchCount(matchCount, bonusMatched)

        assertEquals(Prize.NO_PRIZE, prize)
        assertEquals(0, prize.reward)
    }
}

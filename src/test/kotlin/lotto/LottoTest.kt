package lotto

import lotto.domain.Lotto
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LottoTest {
    @Test
    fun `throws an exception when lotto numbers exceed six`() {
        assertThrows<IllegalArgumentException> {
            Lotto(listOf(1, 2, 3, 4, 5, 6, 7))
        }
    }

    // TODO: Implement production code to pass the test
    @Test
    fun `throws an exception when lotto numbers contain duplicates`() {
        assertThrows<IllegalArgumentException> {
            Lotto(listOf(1, 2, 3, 4, 5, 5))
        }
    }

    @Test
    fun `should throw error if numbers are out of range`() {
        val invalidLotto = listOf(1, 2, 3, 4, 5, 46)
        assertThrows<IllegalArgumentException> {
            Lotto(invalidLotto)
        }
    }

    @Test
    fun `should create valid Lotto object with valid numbers`() {
        val validLotto = Lotto(listOf(1, 2, 3, 4, 5, 6))
        assertThat(validLotto).isNotNull
    }
}

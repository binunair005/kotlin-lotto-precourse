package lotto.domain

enum class Prize(val reward: Long) {
    FIRST(2_000_000_000),
    SECOND(30_000_000),
    THIRD(1_500_000),
    FOURTH(50_000),
    FIFTH(5_000),
    NO_PRIZE(0);

    companion object {
        fun fromMatchCount(matchCount: Int, bonusMatched: Boolean): Prize {
            return when (matchCount) {
                6 -> FIRST
                5 -> if (bonusMatched) SECOND else THIRD
                4 -> FOURTH
                3 -> FIFTH
                else -> NO_PRIZE
            }
        }
    }
}

fun matchCount(winningNumbers: List<Int>, bonusNumber: Int): Pair<Int, Boolean> {
    val matchedNumbers = numbers.filter { it in winningNumbers }
    val bonusMatched = numbers.contains(bonusNumber)

    return Pair(matchedNumbers.size, bonusMatched)
}

override fun toString(): String {
    return numbers.sorted().joinToString(", ")
}
package lotto.utils

import camp.nextstep.edu.missionutils.Console

// Utility class to handle console input/output
object Console {
    // Method to read user input from the console and return it as a string
    fun readLine(prompt: String? = null): String {
        // Optional: print a prompt before reading the input
        prompt?.let { println(it) }
        return Console.readLine().trim() // Read and trim the user input
    }

    // Method to print messages to the console
    fun printMessage(message: String) {
        println(message) // Print the provided message to the console
    }
}
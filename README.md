# Lotto Game

This project is a Kotlin-based lottery ticket machine program that allows users to purchase lottery tickets, compare them to the winning numbers, and calculate the winnings. The program will be built in accordance with the provided requirements and specifications.

## Features to be Implemented

The following features will be implemented for the Lotto application:

### 1. **User Input for Purchase Amount**
- The user will input a purchase amount, and the program will check that the amount is divisible by 1,000 KRW.
- The program will then generate the appropriate number of lottery tickets based on the amount.

### 2. **Generate Random Lotto Tickets**
- The program will generate as many lottery tickets as the user’s budget allows.
- Each ticket will consist of 6 unique random numbers.
- The numbers will be randomly picked from the range of 1 to 45.

### 3. **User Input for Winning Numbers**
- The user will enter the winning numbers, which will consist of 6 unique numbers.
- The program will also prompt the user for a bonus number, which is a separate single number.

### 4. **Prize Calculation**
- The program will compare the user’s lottery tickets to the winning numbers.
- The following prize ranks will be calculated based on the match count:
  - **1st Prize**: 6 numbers matched, 2,000,000,000 KRW.
  - **2nd Prize**: 5 numbers matched + bonus number, 30,000,000 KRW.
  - **3rd Prize**: 5 numbers matched, 1,500,000 KRW.
  - **4th Prize**: 4 numbers matched, 50,000 KRW.
  - **5th Prize**: 3 numbers matched, 5,000 KRW.

### 5. **Return Rate Calculation**
- After calculating the winnings for each ticket, the program will calculate the **total return rate**:
  - The return rate will be calculated based on the total winnings versus the total amount spent on tickets.

### 6. **Error Handling and Validation**
- The program will handle invalid inputs (e.g., non-divisible amounts, invalid number formats) using appropriate exceptions, such as `IllegalArgumentException`.
- If an error is detected, the program will prompt the user again for correct input.

### 7. **Display Results**
- The program will output the results of the lottery tickets:
  - Number of tickets that matched 3, 4, 5, 5 + bonus, and 6 numbers.
  - The corresponding prize for each match.
  - The total return rate.

### 8. **Modular Structure**
- The application will be broken down into different classes to separate the business logic from UI code:
  - **InputView**: Handles user inputs (purchase amount, winning numbers, bonus number).
  - **OutputView**: Displays results (number of tickets, prize amounts, return rate).
  - **Lotto**: Represents a single lottery ticket containing 6 numbers.
  - **LottoGame**: Coordinates the lottery ticket generation, comparison with winning numbers, and prize calculation.

### 9. **Unit Testing**
- Unit tests will be created to verify the correct functionality of the Lotto game:
  - Tests will cover ticket generation, prize calculation, and return rate computation.
  - UI interactions will be excluded from testing, focusing only on the business logic.

---

## Setup and Running the Program

### 1. Clone the Repository

To begin working with the Lotto application, clone the repository:

```bash
git clone https://github.com/yourusername/lotto.git
cd lotto

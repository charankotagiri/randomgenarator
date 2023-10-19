# Random Guess Game - Read Me

This is a simple Java program called "randomguess" that lets the user guess a random number between 0 and 100. This Read Me file provides an overview of the program, how to compile and run it, and some additional information.

## Program Overview
The "randomguess" program is a basic number guessing game where the user attempts to guess a randomly generated number between 0 and 100. The program will provide feedback to the user based on their guesses, indicating whether their guess is too large or too small, and when they guess correctly.

## How to Compile and Run
Follow these steps to compile and run the "randomguess" program:

1. Ensure you have Java installed on your computer.

2. Save the program code to a file with a ".java" extension, for example, "randomguess.java."

3. Open a command prompt or terminal and navigate to the directory where you saved "randomguess.java."

4. Compile the program by executing the following command:
   ```shell
   javac randomguess.java
After successful compilation, run the program with the following command:
java randomguess

How the Program Works
1) The program generates a random number between 0 and 100.

2) It repeatedly prompts the user to enter their guess and provides feedback.

3) If the user's guess matches the random number, the program congratulates them and exits.

4) If the user's guess is too high, it informs them that the number is large.

5) If the user's guess is too low, it informs them that the number is small.

6) The game continues until the user guesses the correct number.

7) After the game, the program reveals the random number.


Additional Notes : 
* The program uses a do-while loop to ensure that the user continues guessing until they get the correct answer.

* The program uses the Scanner class to read user input from the console.

* The random number is generated using the Math.random() function and then scaled to be within the range 0-100.

* The program validates that the user's input is in the range 0-100.

* You can modify the range by changing the values in the code if needed.

Enjoy playing the random guess game!

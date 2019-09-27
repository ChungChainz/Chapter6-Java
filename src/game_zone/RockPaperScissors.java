package game_zone;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int userInput = 0;
        int compInput = rand.nextInt(3) + 1;
        int compWin = 0;
        int userWin = 0;
        int tie = 0;
        final int STOP_PROGRAM = 999;
        String result;

        while (userInput != STOP_PROGRAM) {
            System.out.println("Please enter a number between 1 and 3\n" +
                    "1- Rock\n2- Paper\n3-Scissors (Quit by typing '999')");
            userInput = input.nextInt();
            if (userInput == 1) {
                if (compInput == 1) {
                    result = ("The computer choose rock, it is a Tie!");
                    System.out.println(result);
                    tie = tie + 1;
                } else if (compInput == 2) {
                    result = ("The computer choose paper, YOU LOSE!");
                    System.out.println(result);
                    compWin = compWin + 1;
                } else if (compInput == 3) {
                    result = ("The computer choose scissors, YOU WIN");
                    System.out.println(result);
                    userWin = userWin + 1;
                } else if (compInput == 999){
                    result = ("GAME OVER");
                    System.out.print(result);
                }
                else {
                    result = ("INVALID, TRY AGAIN");
                    System.out.println(result);
                }

            } else if (userInput == 2) {
                if (compInput == 1) {
                    result = ("The computer choose rock, YOU WIN");
                    System.out.println(result);
                    userWin = userWin + 1;
                } else if (compInput == 2) {
                    result = ("The computer choose paper, it is a Tie!");
                    System.out.println(result);
                    tie = tie + 1;
                } else if (compInput == 3) {
                    result = ("The computer choose scissors, YOU LOSE!");
                    System.out.println(result);
                    compWin = compWin + 1;
                }
                else if (compInput == 999){
                    result = ("GAME OVER");
                    System.out.print(result);
                }else {
                    result = ("INVALID, TRY AGAIN");
                    System.out.println(result);
                }
            } else {
                if (compInput == 1) {
                    result = ("The computer choose rock, YOU LOSE");
                    System.out.println(result);
                    compWin = compWin + 1;
                } else if (compInput == 2) {
                    result = ("The computer choose paper, YOU WIN");
                    System.out.println(result);
                    userWin = userWin + 1;
                } else if (compInput == 3) {
                    result = ("The computer choose scissors, it is a Tie!");
                    System.out.println(result);
                    tie = tie + 1;
                } else if (compInput == 999){
                    result = ("GAME OVER");
                    System.out.print(result);
                }else {
                    result = ("INVALID, TRY AGAIN");
                    System.out.println(result);
                }
            }
        }
        System.out.println("User: " + userWin + "\nComputer: " + compWin +
                "\nTies: " + tie);
    }
}

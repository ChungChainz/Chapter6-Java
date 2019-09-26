package exercises;

import java.util.Scanner;

public class TestScoreStatistics {
    public static void main(String[] args) {
        final int STOP_PROGRAM = 999;
        int testScore;
        int numOfScores = 0;
        int average;
        int total = 0;
        int high = 0;
        int low = 100;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter test score percentage here (when finished enter 999) >>> ");
        testScore = input.nextInt();

        while (testScore != STOP_PROGRAM) {
            if (testScore > high && testScore <= 100) {
                high = testScore;
                total = testScore + total;
                System.out.print("Enter test score percentage here >>> ");
                testScore = input.nextInt();
                numOfScores = numOfScores + 1;
                }
                else if(testScore > low && testScore < high)
            {
                total = testScore + total;
                System.out.print("Enter test score percentage here >>> ");
                testScore = input.nextInt();
                numOfScores = numOfScores + 1;
            }
                else if (testScore < low && testScore >= 0)
            {
                low = testScore;
                total = testScore + total;
                System.out.print("Enter test score percentage here >>> ");
                testScore = input.nextInt();
                numOfScores = numOfScores + 1;
            }
                else{
                    System.out.print("!INVALID VALUE!\nEnter test score percentage here >>> ");
                    testScore = input.nextInt();
                }
            }
            average = total / numOfScores;
            System.out.println("The number of test scores entered was " + numOfScores + ".\n" +
                    "The highest test score was " + high + "%.\n" +
                    "The lowest test score was " + low + "%.\n"
                    + "The average test score is " + average + "%.");
        }
    }


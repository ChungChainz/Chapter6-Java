package game_zone;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int choice = 999;
        int counter = 0;
        int rng = rand.nextInt(100) + 1;
        while (choice != rng) {

            System.out.println("Please pick a number between 1 and 100 >>> ");
            choice = input.nextInt();

            if (choice == rng) {
                System.out.println("Congrats, you are a good guesser!");
            } else if (choice > rng) {
                System.out.println("Nope it was lower.");
            } else if (choice < rng) {
                System.out.println("Nope it was higher.");
            }
            counter++;
        }
        System.out.print("It took you " + counter + " chances!");
    }
}


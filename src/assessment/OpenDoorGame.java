package assessment;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class OpenDoorGame {
    public static void main(String[] args)
    {
        int door;
        String prize;
        Scanner input = new Scanner(System.in);
        System.out.print("Choose Door 1, 2, or 3 for a prize >>>");
        door = input.nextInt();

        ArrayList<String> randomPrize = new ArrayList<>();
        randomPrize.add("New House");
        randomPrize.add("New Computer");
        randomPrize.add("New Car");
        Random randomize = new Random();
        String random = randomPrize.get(randomize.nextInt(randomPrize.size()));

        if (door == 1)
        {
            prize = ("You choose Door 1, your prize is a " + random + "!");
        }
        else if (door == 2)
        {
            prize = ("You choose Door 2, your prize is a " + random + "!");
        }
        else if (door == 3)
        {
            prize = ("You choose Door 3, your prize is a " + random + "!");
        }
        else
        {
            prize = ("Invalid Value");
        }
        System.out.print(prize);
    }
}

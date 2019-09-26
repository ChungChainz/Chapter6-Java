package exercises;

import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args)
    {
        int num;
        final int STOP_PROGRAM = 999;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an even number or to stop enter 999 >>> ");
        num = input.nextInt();
        while(num != STOP_PROGRAM)
        {
            if(num % 2 == 0)
            {
                System.out.print("Good Job! \nEnter another number here >>> ");
                num = input.nextInt();
            }
            else
            {
                System.out.print("INVALID! \nEnter another number here >>> ");
                num = input.nextInt();
            }

        }
    }
}

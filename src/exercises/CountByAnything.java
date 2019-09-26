package exercises;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args)
    {
        int count;
        int total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value being counted here >>> ");
        count = input.nextInt();
        for(int i = 1; i < 11; ++i)
        {
            total = count * i;
            System.out.println(total);

        }
    }
}

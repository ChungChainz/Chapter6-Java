package exercises;

public class CountByThrees {
    public static void main(String[] args)
    {
        int count = 0;
        while (count < 301)
        {
            if(count % 3 == 0)
                System.out.println(count);
                count++;

        }
    }
}

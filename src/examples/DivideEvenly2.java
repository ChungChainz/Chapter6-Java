package examples;

public class DivideEvenly2 {
    public static void main(String[] args)
    {
        int limit = 100;
        for(int i = 1; i < limit; ++i)
        {
            if(limit % i == 0 )
            System.out.println(i);
        }
        for (int j = 10; j > 0; --j)
        {
            System.out.println(j);
        }
    }
}

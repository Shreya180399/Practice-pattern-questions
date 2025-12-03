import java.util.Scanner;

public class Pattern1
{
    public static void pattern1(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);

        System.out.println("Enter any number:");
        int n = r.nextInt();

        System.out.println("The  pattern is :");
        pattern1(n);
    }
}
import java.util.Scanner;

public class Pattern13 
{
    public static void pattern13(int n)
    {
        int num=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(num + " ");
                num = num+1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner r = new Scanner(System.in);

        System.out.println("Enter any number:");
        int num = r.nextInt();

        System.out.println("The pattern is:");
        pattern13(num);
    }
    
}
import java.util.Scanner;

public class Pattern4
{
    public static void pattern4(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }    
    public static void main(String[] args) 
    {
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter any number:");
        int num = r.nextInt();

        System.out.println("The pattern is :");
        pattern4(num);
    }
}
